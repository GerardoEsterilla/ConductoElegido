package com.ceiba.vehiculo.controlador;

import com.ceiba.servicio.consulta.ManejadorListarServicio;
import com.ceiba.servicio.modelo.dto.DtoServicio;
import com.ceiba.vehiculo.consulta.ManejadorListarVehiculo;
import com.ceiba.vehiculo.modelo.dto.DtoVehiculo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
@Api(tags={"Controlador consulta vehiculos"})
public class ConsultaControladorVehiculo {

    private final ManejadorListarVehiculo manejadorListarVehiculo;

    public ConsultaControladorVehiculo(ManejadorListarVehiculo manejadorListarVehiculo) {
        this.manejadorListarVehiculo = manejadorListarVehiculo;
    }

    @GetMapping
    @ApiOperation("Listar Vehiculos")
    public List<DtoVehiculo> listar() {
        return this.manejadorListarVehiculo.ejecutar();
    }

}
