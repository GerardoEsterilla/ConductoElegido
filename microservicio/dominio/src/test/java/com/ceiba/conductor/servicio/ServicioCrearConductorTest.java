package com.ceiba.conductor.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.conductor.modelo.entidad.Conductor;
import com.ceiba.conductor.puerto.repositorio.RepositorioConductor;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
import com.ceiba.conductor.servicio.testdatabuilder.ConductorTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioCrearConductorTest {

    @Test
    @DisplayName("Deberia lanzar una exepcion cuando se valide la existencia del conductor")
    void deberiaLanzarUnaExepcionCuandoSeValideLaExistenciaDelConductor() {
        // arrange
        Conductor conductor = new ConductorTestDataBuilder().build();
        RepositorioConductor repositorioConductor = Mockito.mock(RepositorioConductor.class);
        Mockito.when(repositorioConductor.existe(Mockito.anyString())).thenReturn(true);
        ServicioCrearConductor servicioCrearConductor = new ServicioCrearConductor(repositorioConductor);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearConductor.ejecutar(conductor), ExcepcionDuplicidad.class,"El conductor ya existe en el sistema");
    }

    @Test
    @DisplayName("Deberia Crear el conductor de manera correcta")
    void deberiaCrearElUsuarioDeManeraCorrecta() {
        // arrange
        Conductor conductor = new ConductorTestDataBuilder().build();
        RepositorioConductor repositorioConductor = Mockito.mock(RepositorioConductor.class);
        Mockito.when(repositorioConductor.existe(Mockito.anyString())).thenReturn(false);
        Mockito.when(repositorioConductor.crear(conductor)).thenReturn(10L);
        ServicioCrearConductor servicioCrearUsuario = new ServicioCrearConductor(repositorioConductor);
        // act
        Long idConductor = servicioCrearUsuario.ejecutar(conductor);
        //- assert
        assertEquals(10L,idConductor);
        Mockito.verify(repositorioConductor, Mockito.times(1)).crear(conductor);
    }
}
