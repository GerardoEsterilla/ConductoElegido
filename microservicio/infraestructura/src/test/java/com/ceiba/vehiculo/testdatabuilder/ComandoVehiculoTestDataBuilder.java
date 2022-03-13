package com.ceiba.vehiculo.testdatabuilder;

import com.ceiba.vehiculo.comando.ComandoVehiculo;
import java.util.UUID;

public class ComandoVehiculoTestDataBuilder {

    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private Long idCliente;


    public ComandoVehiculoTestDataBuilder() {
        marca = UUID.randomUUID().toString();
        modelo = UUID.randomUUID().toString();
        placa = UUID.randomUUID().toString();
        idCliente= UUID.randomUUID().getLeastSignificantBits();
    }

    public ComandoVehiculoTestDataBuilder conNombre(String marca) {
        this.marca = marca;
        return this;
    }

    public ComandoVehiculo build() {
        return new ComandoVehiculo(id,marca, modelo, placa,idCliente);
    }
}
