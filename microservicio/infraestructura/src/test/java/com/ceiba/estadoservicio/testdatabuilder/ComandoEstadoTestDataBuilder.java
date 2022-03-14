package com.ceiba.estadoservicio.testdatabuilder;

import com.ceiba.estado.comando.ComandoEstado;

import java.util.UUID;

public class ComandoEstadoTestDataBuilder {

    private Long id;
    private String nombre ;
    private Long idServicio;


    public ComandoEstadoTestDataBuilder() {
        nombre = UUID.randomUUID().toString();
        idServicio= UUID.randomUUID().getLeastSignificantBits();
    }

    public ComandoEstadoTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ComandoEstado build() {
        return new ComandoEstado(id,nombre, idServicio);
    }
}
