package com.ceiba.estado.comando.fabrica;

import com.ceiba.estado.comando.ComandoEstado;
import com.ceiba.estadoservicio.modelo.entidad.Estado;
import org.springframework.stereotype.Component;

@Component
public class FabricaEstado {

    public Estado crear(ComandoEstado comandoEstado) {
        return new Estado(
                comandoEstado.getId(),
                comandoEstado.getNombre(),
                comandoEstado.getIdServicio()
                );
    }

}
