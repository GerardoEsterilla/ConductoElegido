package com.ceiba.estado.comando.manejador;

import com.ceiba.estado.comando.ComandoEstado;
import com.ceiba.estado.comando.fabrica.FabricaEstado;
import com.ceiba.estadoservicio.modelo.entidad.Estado;
import com.ceiba.estadoservicio.servicio.ServicioActualizarEstado;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarEstado implements ManejadorComando<ComandoEstado> {

    private final FabricaEstado fabricaEstado;
    private final ServicioActualizarEstado servicioActualizarEstado;

    public ManejadorActualizarEstado(FabricaEstado fabricaEstado, ServicioActualizarEstado servicioActualizarEstado) {
        this.fabricaEstado = fabricaEstado;
        this.servicioActualizarEstado = servicioActualizarEstado;
    }

    public void ejecutar(ComandoEstado comandoEstado) {
        Estado estado = this.fabricaEstado.crear(comandoEstado);
        this.servicioActualizarEstado.ejecutar(estado);
    }
}
