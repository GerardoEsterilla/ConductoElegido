package com.ceiba.estadoservicio.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.estadoservicio.modelo.entidad.Estado;
import com.ceiba.estadoservicio.puerto.repositorio.RepositorioEstado;
import com.ceiba.estadoservicio.servicio.testdatabuilder.EstadoTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioCrearEstadoTest {

    @Test
    @DisplayName("Deberia lanzar una excepcion cuando se valide la existencia del Estado")
    void deberiaLanzarUnaExepcionCuandoSeValideLaExistenciaDelEstado() {
        // arrange
        Estado estado = new EstadoTestDataBuilder().build();
        RepositorioEstado repositorioEstado = Mockito.mock(RepositorioEstado.class);
        Mockito.when(repositorioEstado.existe(Mockito.anyString())).thenReturn(true);
        ServicioCrearEstado servicioCrearEstado = new ServicioCrearEstado(repositorioEstado);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearEstado.ejecutar(estado), ExcepcionDuplicidad.class,"El estado ya existe en el sistema");
    }

    @Test
    @DisplayName("Deberia Crear el estado de manera correcta")
    void deberiaCrearElEstadoDeManeraCorrecta() {
        // arrange
        Estado estado = new EstadoTestDataBuilder().build();
        RepositorioEstado repositorioEstado = Mockito.mock(RepositorioEstado.class);
        Mockito.when(repositorioEstado.existe(Mockito.anyString())).thenReturn(false);
        Mockito.when(repositorioEstado.crear(estado)).thenReturn(10L);
        ServicioCrearEstado servicioCrearEstado = new ServicioCrearEstado(repositorioEstado);
        // act
        Long idEstado = servicioCrearEstado.ejecutar(estado);
        //- assert
        assertEquals(10L,idEstado);
        Mockito.verify(repositorioEstado, Mockito.times(1)).crear(estado);
    }
}
