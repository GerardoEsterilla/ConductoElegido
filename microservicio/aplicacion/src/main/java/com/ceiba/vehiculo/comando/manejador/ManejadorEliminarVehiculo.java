package com.ceiba.vehiculo.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.servicio.servicio.ServicioEliminarServicio;
import com.ceiba.vehiculo.comando.fabrica.FabricaVehiculo;
import com.ceiba.vehiculo.servicio.ServicioCrearVehiculo;
import com.ceiba.vehiculo.servicio.ServicioEliminarVehiculo;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarVehiculo implements ManejadorComando<Long> {

    private final ServicioEliminarVehiculo servicioEliminarVehiculo;

    public ManejadorEliminarVehiculo( ServicioEliminarVehiculo servicioEliminarVehiculo) {
        this.servicioEliminarVehiculo = servicioEliminarVehiculo;
    }

    public void ejecutar(Long idVehiculo) {
        this.servicioEliminarVehiculo.ejecutar(idVehiculo);
    }
}
