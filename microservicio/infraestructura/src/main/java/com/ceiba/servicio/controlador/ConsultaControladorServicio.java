package com.ceiba.servicio.controlador;

import com.ceiba.cliente.modelo.dto.DtoCliente;
import com.ceiba.servicio.consulta.ManejadorListarServicio;
import com.ceiba.servicio.modelo.dto.DtoServicio;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/servicios")
@Api(tags={"Controlador consulta servicio"})
public class ConsultaControladorServicio {

    private final ManejadorListarServicio manejadorListarServicio;

    public ConsultaControladorServicio(ManejadorListarServicio manejadorListarServicio) {
        this.manejadorListarServicio = manejadorListarServicio;
    }

    @GetMapping
    @ApiOperation("Listar Servicios")
    public List<DtoServicio> listar() {
        return this.manejadorListarServicio.ejecutar();
    }

    @GetMapping(value = "/{idCliente}")
    @ApiOperation("Listar servicios por cliente")
    public List<DtoServicio> listarClienteCedula(@PathVariable Long idCliente) {
        return this.manejadorListarServicio.ejecutarCedulaCliente(idCliente);
    }

}
