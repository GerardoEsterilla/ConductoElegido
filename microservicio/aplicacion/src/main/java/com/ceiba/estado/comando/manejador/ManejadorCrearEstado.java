package com.ceiba.estado.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.estado.comando.ComandoEstado;
import com.ceiba.estado.comando.fabrica.FabricaEstado;
import com.ceiba.estadoServicios.modelo.entidad.Estado;
import com.ceiba.estadoServicios.servicio.ServicioCrearEstado;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.servicio.ServicioCrearVehiculo;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearEstado implements ManejadorComandoRespuesta<ComandoEstado, ComandoRespuesta<Long>> {

    private final FabricaEstado fabricaEstado;
    private final ServicioCrearEstado servicioCrearEstado;

    public ManejadorCrearEstado(FabricaEstado fabricaEstado, ServicioCrearEstado servicioCrearEstado) {
        this.fabricaEstado = fabricaEstado;
        this.servicioCrearEstado = servicioCrearEstado;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoEstado comandoEstado) {
        Estado estado = this.fabricaEstado.crear(comandoEstado);
        return new ComandoRespuesta<>(this.servicioCrearEstado.ejecutar(estado));
    }
}
