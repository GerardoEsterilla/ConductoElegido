package com.ceiba.vehiculo.entidad;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.servicio.testdatabuilder.VehiculoTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculoTest {

    @Test
    @DisplayName("Deberia crear correctamente el vehiculo")
    void deberiaCrearCorrectamenteElVehiculo() {

        //act
        Vehiculo vehiculo = new VehiculoTestDataBuilder().conId(1L).build();
        //assert
        assertEquals(1, vehiculo.getId());
        assertEquals("Chevrolet", vehiculo.getMarca());
        assertEquals("2022", vehiculo.getModelo());
        assertEquals("FXC123", vehiculo.getPlaca());
        assertEquals(1L, vehiculo.getIdCliente());

    }

    @Test
    void deberiaFallarSinMarcaDeVehiculo() {

        //Arrange
        VehiculoTestDataBuilder vehiculoTestDataBuilder = new VehiculoTestDataBuilder().conMarca(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    vehiculoTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la marca de cliente");
    }

    @Test
    void deberiaFallarSinModeloDeVehiculo() {

        //Arrange
        VehiculoTestDataBuilder vehiculoTestDataBuilder = new VehiculoTestDataBuilder().conModelo(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    vehiculoTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el modelo del vehiculo");
    }



    @Test
    void deberiaFallarSinPlacaDeVehiculo() {

        //Arrange
        VehiculoTestDataBuilder vehiculoTestDataBuilder = new VehiculoTestDataBuilder().conPlaca(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    vehiculoTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la placa del vehiculo");
    }

    @Test
    void deberiaFallarSinIdCliente() {

        //Arrange
        VehiculoTestDataBuilder vehiculoTestDataBuilder = new VehiculoTestDataBuilder().conIdCliente(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    vehiculoTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar un idCliente del vehiculo");
    }




}
