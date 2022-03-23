package com.ceiba.servicio.servicio.testdatabuilder;

import com.ceiba.servicio.modelo.entidad.Servicio;

import java.time.LocalDateTime;

public class ServicioTestDataBuilder {

    private Long id;
    private Long idConductor;
    private Long idCliente;
    private String origen;
    private String destino;
    private LocalDateTime fechaServicio;
    private Long valor;
    private String descripcion;

    public ServicioTestDataBuilder() {
        idConductor = 1L;
        idCliente = 1L;
        origen = "A";
        destino = "B";
        fechaServicio = LocalDateTime.parse("2022-03-13T19:30:13.859604100");
        valor= 1l;
        descripcion= "ViajeTest";
    }

    public ServicioTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public ServicioTestDataBuilder conIdConductor(Long idConductor) {
        this.idConductor = idConductor;
        return this;
    }
    public ServicioTestDataBuilder conIdCliente(Long idCliente) {
        this.idCliente = idCliente;
        return this;
    }

    public ServicioTestDataBuilder conOrigen(String origen) {
        this.origen = origen;
        return this;
    }

    public ServicioTestDataBuilder conDestino(String destino) {
        this.destino = destino;
        return this;
    }

    public ServicioTestDataBuilder conFechaServicio(LocalDateTime fechaServicio) {
        this.fechaServicio = fechaServicio;
        return this;
    }

    public ServicioTestDataBuilder conValor(Long valor) {
        this.valor = valor;
        return this;
    }

    public ServicioTestDataBuilder conDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }


    public Servicio build() {
        return new Servicio(id,idCliente,origen,destino,fechaServicio,descripcion);
    }
}
