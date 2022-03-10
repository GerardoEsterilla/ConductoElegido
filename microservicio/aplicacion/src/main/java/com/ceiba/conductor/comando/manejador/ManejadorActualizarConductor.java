package com.ceiba.conductor.comando.manejador;

import com.ceiba.conductor.modelo.entidad.Conductor;
import com.ceiba.conductor.servicio.ServicioActualizarConductor;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

import com.ceiba.conductor.comando.ComandoConductor;
import com.ceiba.conductor.comando.fabrica.FabricaConductor;

@Component
public class ManejadorActualizarConductor implements ManejadorComando<ComandoConductor> {

    private final FabricaConductor fabricaConductor;
    private final ServicioActualizarConductor servicioActualizarConductor;

    public ManejadorActualizarConductor(FabricaConductor fabricaConductor, ServicioActualizarConductor servicioActualizarConductor) {
        this.fabricaConductor = fabricaConductor;
        this.servicioActualizarConductor = servicioActualizarConductor;
    }

    public void ejecutar(ComandoConductor comandoConductor) {
        Conductor conductor = this.fabricaConductor.crear(comandoConductor);
        this.servicioActualizarConductor.ejecutar(conductor);
    }
}
