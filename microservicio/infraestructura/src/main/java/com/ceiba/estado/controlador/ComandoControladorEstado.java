package com.ceiba.estado.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.estado.comando.ComandoEstado;
import com.ceiba.estado.comando.manejador.ManejadorActualizarEstado;
import com.ceiba.estado.comando.manejador.ManejadorCrearEstado;
import com.ceiba.vehiculo.comando.ComandoVehiculo;
import com.ceiba.vehiculo.comando.manejador.ManejadorActualizarVehiculo;
import com.ceiba.vehiculo.comando.manejador.ManejadorCrearVehiculo;
import com.ceiba.vehiculo.comando.manejador.ManejadorEliminarVehiculo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estado")
@Api(tags = { "Controlador comando estado"})
public class ComandoControladorEstado {

    private final ManejadorCrearEstado manejadorCrearEstado;
    private final ManejadorActualizarEstado manejadorActualizarEstado;

    @Autowired
    public ComandoControladorEstado(ManejadorCrearEstado manejadorCrearEstado,
                                    ManejadorActualizarEstado manejadorActualizarEstado) {
        this.manejadorCrearEstado = manejadorCrearEstado;
        this.manejadorActualizarEstado = manejadorActualizarEstado;
    }

    @PostMapping
    @ApiOperation("Crear Estado")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoEstado comandoEstado) {
        return manejadorCrearEstado.ejecutar(comandoEstado);
    }

  /**  @DeleteMapping(value="/{id}")
    @ApiOperation("Eliminar Estado")
    public void eliminar(@PathVariable Long id) {
        manejadorEliminarEstado.ejecutar(id);
    }*/

    @PutMapping(value="/{id}")
    @ApiOperation("Actualizar Estado")
    public void actualizar(@RequestBody ComandoEstado comandoEstado,@PathVariable Long id) {
        comandoEstado.setId(id);
        manejadorActualizarEstado.ejecutar(comandoEstado);
    }
}
