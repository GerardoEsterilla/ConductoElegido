package com.ceiba.estadoservicio.entidad;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import com.ceiba.estadoservicio.modelo.entidad.Estado;
import com.ceiba.estadoservicio.servicio.testdatabuilder.EstadoTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstadoTest {

    @Test
    @DisplayName("Deberia crear correctamente el Estado")
    void deberiaCrearCorrectamenteElEstado() {

        //act
        Estado estado = new EstadoTestDataBuilder().conId(1L).build();
        //assert
        assertEquals(1, estado.getId());
        assertEquals("EstadoTest", estado.getNombre());
        assertEquals(1L, estado.getIdServicio());

    }

    @Test
    void deberiaFallarSinNombreDeEstado() {

        //Arrange
        EstadoTestDataBuilder estadoTestDataBuilder = new EstadoTestDataBuilder().conNombre(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    estadoTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el nombre de estado");
    }


    @Test
    void deberiaFallarSinIdCliente() {

        //Arrange
        EstadoTestDataBuilder estadoTestDataBuilder = new EstadoTestDataBuilder().conIdServicio(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    estadoTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el idServicio");
    }




}
