package com.ceiba.estado.comando.fabrica;

import com.ceiba.estado.comando.ComandoEstado;
import com.ceiba.estadoServicios.modelo.entidad.Estado;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import org.springframework.stereotype.Component;

@Component
public class FabricaEstado {

    public Estado crear(ComandoEstado comandoEstado) {
        return new Estado(
                comandoEstado.getId(),
                comandoEstado.getEstado(),
                comandoEstado.getId_servicio()
                );
    }

}
