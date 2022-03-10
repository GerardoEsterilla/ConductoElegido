package com.ceiba.conductor.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.conductor.comando.ComandoConductor;
import com.ceiba.conductor.comando.manejador.ManejadorActualizarConductor;
import com.ceiba.conductor.comando.manejador.ManejadorCrearConductor;
import com.ceiba.conductor.comando.manejador.ManejadorEliminarConductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/conductor")
@Api(tags = { "Controlador comando conductor"})
public class ComandoControladorConductor {

    private final ManejadorCrearConductor manejadorCrearConductor;
    private final ManejadorEliminarConductor manejadorEliminarConductor;
    private final ManejadorActualizarConductor manejadorActualizarConductor;

    @Autowired
    public ComandoControladorConductor(ManejadorCrearConductor manejadorCrearConductor,
                                     ManejadorEliminarConductor manejadorEliminarConductor,
                                     ManejadorActualizarConductor manejadorActualizarConductor) {
        this.manejadorCrearConductor = manejadorCrearConductor;
        this.manejadorEliminarConductor = manejadorEliminarConductor;
        this.manejadorActualizarConductor = manejadorActualizarConductor;
    }

    @PostMapping
    @ApiOperation("Crear Conductor")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoConductor comandoConductor) {
        return manejadorCrearConductor.ejecutar(comandoConductor);
    }

    @DeleteMapping(value="/{id}")
    @ApiOperation("Eliminar Conductor")
    public void eliminar(@PathVariable Long id) {
        manejadorEliminarConductor.ejecutar(id);
    }

    @PutMapping(value="/{id}")
    @ApiOperation("Actualizar Conductor")
    public void actualizar(@RequestBody ComandoConductor comandoConductor,@PathVariable Long id) {
        comandoConductor.setId(id);
        manejadorActualizarConductor.ejecutar(comandoConductor);
    }
}
