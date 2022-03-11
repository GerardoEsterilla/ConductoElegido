package com.ceiba.conductor.servicio.testdatabuilder;

import com.ceiba.conductor.modelo.entidad.Conductor;

import java.time.LocalDateTime;

public class ConductorTestDataBuilder {

    private Long id;
    private String nombreConductor;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private String cedula;
    private String email;
    private String telefono;
    private String foto;

    public ConductorTestDataBuilder() {
        nombreConductor = "Conductor 1";
        apellido = "Rapido";
        fechaNacimiento = LocalDateTime.now();
        cedula = "11123333444";
        email = "Conductor@hotmail.es";
        telefono = "123123412";
        foto = "asdasadjas";
    }

    public ConductorTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public ConductorTestDataBuilder conNombre(String nombreConductor) {
        this.nombreConductor = nombreConductor;
        return this;
    }

    public ConductorTestDataBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public ConductorTestDataBuilder conFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public ConductorTestDataBuilder conCedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public ConductorTestDataBuilder conEmail(String email) {
        this.email = email;
        return this;
    }

    public ConductorTestDataBuilder conTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public ConductorTestDataBuilder conFoto(String foto) {
        this.foto = foto;
        return this;
    }



    public Conductor build() {
        return new Conductor(id,nombreConductor,apellido,fechaNacimiento,cedula,email,telefono,foto);
    }
}
