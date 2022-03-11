package com.ceiba.conductor.entidad;

import com.ceiba.BasePrueba;
import com.ceiba.conductor.modelo.entidad.Conductor;
import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import com.ceiba.conductor.servicio.testdatabuilder.ConductorTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConductorTest {

    @Test
    @DisplayName("Deberia crear correctamente el conductor")
    void deberiaCrearCorrectamenteElConductor() {
        // arrange
        LocalDateTime fechaNacimiento = LocalDateTime.now();

        //act
        Conductor conductor = new ConductorTestDataBuilder().conFechaNacimiento(fechaNacimiento).conId(1L).build();
        //assert
        assertEquals(1, conductor.getId());
        assertEquals("Conductor 1", conductor.getNombre());
        assertEquals("Rapido", conductor.getApellido());
        assertEquals(fechaNacimiento, conductor.getFechaNacimiento());
        assertEquals("11123333444", conductor.getCedula());
        assertEquals("Conductor@hotmail.es", conductor.getEmail());
        assertEquals("123123412", conductor.getTelefono());
        assertEquals("asdasadjas", conductor.getFoto());

        System.out.println(fechaNacimiento.equals(conductor.getFechaNacimiento()));


    }

    @Test
    void deberiaFallarSinNombreDeConductor() {

        //Arrange
        ConductorTestDataBuilder conductorTestDataBuilder = new ConductorTestDataBuilder().conNombre(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    conductorTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el nombre de conductor");
    }

    @Test
    void deberiaFallarSinApellidoDeConductor() {

        //Arrange
        ConductorTestDataBuilder conductorTestDataBuilder = new ConductorTestDataBuilder().conApellido(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    conductorTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el apellido");
    }


    @Test
    void deberiaFallarSinFechaNacimiento() {

        //Arrange
        ConductorTestDataBuilder conductorTestDataBuilder = new ConductorTestDataBuilder().conFechaNacimiento(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    conductorTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la fechaNacimiento");
    }

    @Test
    void deberiaFallarSinCedulaDeConductor() {

        //Arrange
        ConductorTestDataBuilder conductorTestDataBuilder = new ConductorTestDataBuilder().conCedula(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    conductorTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la cedula");
    }

    @Test
    void deberiaFallarSinEmailDeConductor() {

        //Arrange
        ConductorTestDataBuilder conductorTestDataBuilder = new ConductorTestDataBuilder().conEmail(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    conductorTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el email");
    }

    @Test
    void deberiaFallarSinTelefonoDeConductor() {

        //Arrange
        ConductorTestDataBuilder conductorTestDataBuilder = new ConductorTestDataBuilder().conTelefono(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    conductorTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el telefono");
    }

    @Test
    void deberiaFallarSinFotoDeConductor() {

        //Arrange
        ConductorTestDataBuilder conductorTestDataBuilder = new ConductorTestDataBuilder().conFoto(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    conductorTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la foto");
    }


}
