package com.ceiba.cliente.servicio.testdatabuilder;

import com.ceiba.cliente.modelo.entidad.Cliente;

import java.time.LocalDateTime;

public class ClienteTestDataBuilder {

    private Long id;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private String cedula;
    private String email;

    public ClienteTestDataBuilder() {
        nombre = "Cliente 1";
        apellido = "Llevame";
        fechaNacimiento = LocalDateTime.now();
        cedula = "11cedulacliente";
        email = "Cliente@hotmail.es";

    }

    public ClienteTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public ClienteTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ClienteTestDataBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public ClienteTestDataBuilder conFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public ClienteTestDataBuilder conCedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public ClienteTestDataBuilder conEmail(String email) {
        this.email = email;
        return this;
    }



    public Cliente build() {
        return new Cliente(id,nombre,apellido,fechaNacimiento,cedula,email);
    }
}
