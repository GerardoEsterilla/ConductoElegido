package com.ceiba.servicio.testdatabuilder;

import com.ceiba.servicio.comando.ComandoServicio;

import java.time.LocalDateTime;
import java.util.UUID;

public class ComandoServicioTestDataBuilder {

    private Long id;
    private Long idConductor;
    private Long idCliente;
    private String origen;
    private String destino;
    private LocalDateTime fechaServicio;
    private Long valor;
    private String descripcion;



    public ComandoServicioTestDataBuilder() {
        idConductor= UUID.randomUUID().getLeastSignificantBits();
        idCliente= UUID.randomUUID().getLeastSignificantBits();
        origen = UUID.randomUUID().toString();
        destino = UUID.randomUUID().toString();
        fechaServicio = LocalDateTime.now();
        valor= 2L;
        descripcion = UUID.randomUUID().toString();

    }

    public ComandoServicioTestDataBuilder conDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public ComandoServicio build() {
        return new ComandoServicio(id,idConductor, idCliente, origen,destino,fechaServicio,valor,descripcion);
    }
}
