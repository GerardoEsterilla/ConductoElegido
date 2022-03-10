package com.ceiba.vehiculo.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoVehiculo {

    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private Long id_cliente;

}
