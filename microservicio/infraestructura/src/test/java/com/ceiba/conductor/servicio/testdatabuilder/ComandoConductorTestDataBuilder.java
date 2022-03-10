package com.ceiba.conductor.servicio.testdatabuilder;

import com.ceiba.conductor.comando.ComandoConductor;

import java.time.LocalDateTime;
import java.util.UUID;

public class ComandoConductorTestDataBuilder {

    private Long id;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private String cedula;
    private String email;
    private String telefono;
    private String foto;

    public ComandoConductorTestDataBuilder() {
        nombre = UUID.randomUUID().toString();
        apellido = UUID.randomUUID().toString();
        fechaNacimiento = LocalDateTime.now();
        cedula = UUID.randomUUID().toString();
        email = UUID.randomUUID().toString();
        telefono = UUID.randomUUID().toString();
        foto = UUID.randomUUID().toString();
    }

    public ComandoConductorTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ComandoConductor build() {
        return new ComandoConductor(id,nombre, apellido, fechaNacimiento,cedula,email,telefono,foto);
    }
}
