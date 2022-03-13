package com.ceiba.vehiculo.servicio.testdatabuilder;

import com.ceiba.vehiculo.modelo.entidad.Vehiculo;

public class VehiculoTestDataBuilder {

    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private Long idCliente;

    public VehiculoTestDataBuilder() {
        marca = "Chevrolet";
        modelo = "2022";
        placa = "FXC123";
        idCliente = 1L;
    }

    public VehiculoTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public VehiculoTestDataBuilder conMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public VehiculoTestDataBuilder conModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public VehiculoTestDataBuilder conPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public VehiculoTestDataBuilder conIdCliente(Long idCliente) {
        this.idCliente = idCliente;
        return this;
    }

    public Vehiculo build() {
        return new Vehiculo(id,marca,modelo,placa,idCliente);
    }
}
