package com.ceiba.cliente.testdatabuilder;

import com.ceiba.cliente.comando.ComandoCliente;

import java.time.LocalDateTime;
import java.util.UUID;

public class ComandoClienteTestDataBuilder {

    private Long id;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private String cedula;
    private String email;


    public ComandoClienteTestDataBuilder() {
        nombre = UUID.randomUUID().toString();
        apellido = UUID.randomUUID().toString();
        fechaNacimiento = LocalDateTime.now();
        cedula = UUID.randomUUID().toString();
        email = UUID.randomUUID().toString();

    }

    public ComandoClienteTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ComandoCliente build() {
        return new ComandoCliente(id,nombre, apellido, fechaNacimiento,cedula,email);
    }
}
