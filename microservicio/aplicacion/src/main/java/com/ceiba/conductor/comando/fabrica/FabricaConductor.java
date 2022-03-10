package com.ceiba.conductor.comando.fabrica;

import com.ceiba.conductor.modelo.entidad.Conductor;
import org.springframework.stereotype.Component;

import com.ceiba.conductor.comando.ComandoConductor;

@Component
public class FabricaConductor {

    public Conductor crear(ComandoConductor comandoConductor) {
        return new Conductor(
                comandoConductor.getId(),
                comandoConductor.getNombre(),
                comandoConductor.getApellido(),
                comandoConductor.getFechaNacimiento(),
                comandoConductor.getCedula(),
                comandoConductor.getEmail(),
                comandoConductor.getTelefono(),
                comandoConductor.getFoto()

        );
    }

}
