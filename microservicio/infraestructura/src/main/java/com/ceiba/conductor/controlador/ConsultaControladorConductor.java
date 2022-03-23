package com.ceiba.conductor.controlador;

import java.util.List;

import com.ceiba.cliente.modelo.dto.DtoCliente;
import com.ceiba.conductor.consulta.ManejadorListarConductor;
import com.ceiba.conductor.modelo.dto.DtoConductor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/conductores")
@Api(tags={"Controlador consulta conductor"})
public class ConsultaControladorConductor {

    private final ManejadorListarConductor manejadorListarConductor;

    public ConsultaControladorConductor(ManejadorListarConductor manejadorListarConductor) {
        this.manejadorListarConductor = manejadorListarConductor;
    }

    @GetMapping
    @ApiOperation("Listar conductores")
    public List<DtoConductor> listar() {
        return this.manejadorListarConductor.ejecutar();
    }

    @GetMapping(value = "/{cedula}")
    @ApiOperation("Listar conductor por cedula")
    public DtoConductor listarConductorCedula(@PathVariable String cedula) {
        return this.manejadorListarConductor.ejecutarCedulaConductor(cedula);
    }



}
