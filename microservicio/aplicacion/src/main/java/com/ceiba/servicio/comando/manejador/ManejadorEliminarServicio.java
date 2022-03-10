package com.ceiba.servicio.comando.manejador;

import com.ceiba.cliente.servicio.ServicioEliminarCliente;
import com.ceiba.manejador.ManejadorComando;
import com.ceiba.servicio.comando.fabrica.FabricaServicio;
import com.ceiba.servicio.servicio.ServicioCrearServicio;
import com.ceiba.servicio.servicio.ServicioEliminarServicio;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarServicio implements ManejadorComando<Long> {

    private final ServicioEliminarServicio servicioEliminarServicio;

    public ManejadorEliminarServicio(ServicioEliminarServicio servicioEliminarServicio) {
        this.servicioEliminarServicio = servicioEliminarServicio;
    }

    public void ejecutar(Long idServicio) {
        this.servicioEliminarServicio.ejecutar(idServicio);
    }
}
