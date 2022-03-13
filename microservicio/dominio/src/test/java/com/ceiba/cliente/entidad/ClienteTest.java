package com.ceiba.cliente.entidad;

import com.ceiba.BasePrueba;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.servicio.testdatabuilder.ClienteTestDataBuilder;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    @DisplayName("Deberia crear correctamente el cliente")
    void deberiaCrearCorrectamenteElCliente() {
        // arrange
        LocalDateTime fechaNacimiento = LocalDateTime.now();

        //act
        Cliente cliente = new ClienteTestDataBuilder().conFechaNacimiento(fechaNacimiento).conId(1L).build();
        //assert
        assertEquals(1, cliente.getId());
        assertEquals("Cliente 1", cliente.getNombre());
        assertEquals("Llevame", cliente.getApellido());
        assertEquals(fechaNacimiento, cliente.getFechaNacimiento());
        assertEquals("11cedulacliente", cliente.getCedula());
        assertEquals("Cliente@hotmail.es", cliente.getEmail());

    }

    @Test
    void deberiaFallarSinNombreDeCliente() {

        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conNombre(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    clienteTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el nombre de cliente");
    }

    @Test
    void deberiaFallarSinApellidoDeCliente() {

        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conApellido(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    clienteTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el apellido");
    }


    @Test
    void deberiaFallarSinFechaNacimiento() {

        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conFechaNacimiento(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    clienteTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la fechaNacimiento");
    }

    @Test
    void deberiaFallarSinCedulaDeCliente() {

        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conCedula(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    clienteTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la cedula");
    }

    @Test
    void deberiaFallarSinEmailDeCliente() {

        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conEmail(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    clienteTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el email");
    }




}
