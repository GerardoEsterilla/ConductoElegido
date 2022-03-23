package com.ceiba.servicio.entidad;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import com.ceiba.servicio.modelo.entidad.Servicio;
import com.ceiba.servicio.servicio.testdatabuilder.ServicioTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioTest {

    @Test
    @DisplayName("Deberia crear correctamente el servicio")
    void deberiaCrearCorrectamenteElServicio() {
        // arrange
        LocalDateTime fechaServicio = LocalDateTime.parse("2022-03-13T19:30:13.859604100");
        //act
        Servicio servicio = new ServicioTestDataBuilder().conId(1L).build();
        //assert
        assertEquals(1, servicio.getId());
        assertEquals(null, servicio.getIdConductor());
        assertEquals(1, servicio.getIdCliente());
        assertEquals("A", servicio.getOrigen());
        assertEquals("B", servicio.getDestino());
        assertEquals(fechaServicio, servicio.getFechaServicio());
        assertEquals(null, servicio.getValor());
        assertEquals("ViajeTest", servicio.getDescripcion());

    }

    @Test
    void deberiaFallarSinIdCliente() {

        //Arrange
        ServicioTestDataBuilder servicioTestDataBuilder = new ServicioTestDataBuilder().conIdCliente(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    servicioTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el idCliente");
    }

    @Test
    void deberiaFallarSinOrigenDeServicio() {

        //Arrange
        ServicioTestDataBuilder servicioTestDataBuilder = new ServicioTestDataBuilder().conOrigen(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    servicioTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el origen del servicio");
    }

    @Test
    void deberiaFallarSinDestinoDeServicio() {

        //Arrange
        ServicioTestDataBuilder servicioTestDataBuilder = new ServicioTestDataBuilder().conDestino(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    servicioTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el destino del servicio");
    }

    @Test
    void deberiaFallarSinFechaServicio() {

        //Arrange
        ServicioTestDataBuilder servicioTestDataBuilder = new ServicioTestDataBuilder().conFechaServicio(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    servicioTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la fechaServicio");
    }


    @Test
    void deberiaFallarSinDescripcion() {

        //Arrange
        ServicioTestDataBuilder servicioTestDataBuilder = new ServicioTestDataBuilder().conDescripcion(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    servicioTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la descripcion del servicio");
    }



}
