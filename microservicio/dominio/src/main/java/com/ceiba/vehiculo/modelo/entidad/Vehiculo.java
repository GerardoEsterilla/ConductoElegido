package com.ceiba.vehiculo.modelo.entidad;

import lombok.Getter;


import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;
@Getter
public class Vehiculo {

    private static final String SE_DEBE_INGRESAR_LA_MARCA_DE_VEHICULO = "Se debe ingresar la marca de cliente";
    private static final String SE_DEBE_INGRESAR_EL_MODELO_DE_VEHICULO = "Se debe ingresar el modelo del vehiculo";
    private static final String SE_DEBE_INGRESAR_LA_PLACA_DE_VEHICULO = "Se debe ingresar la placa del vehiculo";
    private static final String SE_DEBE_INGRESAR_UN_CLIENTE_DE_VEHICULO = "Se debe ingresar un cliente del vehiculo";

    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private Long idCliente;


    public Vehiculo(Long id, String marca, String modelo, String placa, Long idCliente) {
        validarObligatorio(marca, SE_DEBE_INGRESAR_LA_MARCA_DE_VEHICULO);
        validarObligatorio(modelo, SE_DEBE_INGRESAR_EL_MODELO_DE_VEHICULO);
        validarObligatorio(placa, SE_DEBE_INGRESAR_LA_PLACA_DE_VEHICULO);
        validarObligatorio(idCliente, SE_DEBE_INGRESAR_UN_CLIENTE_DE_VEHICULO);

        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.idCliente = idCliente;
    }
}
