package com.ceiba.estadoservicio.servicio.testdatabuilder;

import com.ceiba.estadoservicio.modelo.entidad.Estado;

public class EstadoTestDataBuilder {

    private Long id;
    private String nombre ;
    private Long idServicio;

    public EstadoTestDataBuilder() {
        nombre = "EstadoTest";
        idServicio = 1L;
    }

    public EstadoTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public EstadoTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EstadoTestDataBuilder conIdServicio(Long idServicio) {
        this.idServicio = idServicio;
        return this;
    }

    public Estado build() {
        return new Estado(id,nombre,idServicio);
    }
}
