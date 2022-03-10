package com.ceiba.conductor.comando.manejador;

import com.ceiba.conductor.servicio.ServicioEliminarConductor;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarConductor implements ManejadorComando<Long> {

    private final ServicioEliminarConductor servicioEliminarConductor;

    public ManejadorEliminarConductor(ServicioEliminarConductor servicioEliminarConductor) {
        this.servicioEliminarConductor = servicioEliminarConductor;
    }

    public void ejecutar(Long idConductor) {
        this.servicioEliminarConductor.ejecutar(idConductor);
    }
}
