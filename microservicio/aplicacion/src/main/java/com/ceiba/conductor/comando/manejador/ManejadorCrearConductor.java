package com.ceiba.conductor.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.conductor.modelo.entidad.Conductor;
import com.ceiba.conductor.servicio.ServicioCrearConductor;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

import com.ceiba.conductor.comando.ComandoConductor;
import com.ceiba.conductor.comando.fabrica.FabricaConductor;

@Component
public class ManejadorCrearConductor implements ManejadorComandoRespuesta<ComandoConductor, ComandoRespuesta<Long>> {

    private final FabricaConductor fabricaConductor;
    private final ServicioCrearConductor servicioCrearConductor;

    public ManejadorCrearConductor(FabricaConductor fabricaConductor, ServicioCrearConductor servicioCrearConductor) {
        this.fabricaConductor = fabricaConductor;
        this.servicioCrearConductor = servicioCrearConductor;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoConductor comandoConductor) {
        Conductor conductor = this.fabricaConductor.crear(comandoConductor);
        return new ComandoRespuesta<>(this.servicioCrearConductor.ejecutar(conductor));
    }
}
