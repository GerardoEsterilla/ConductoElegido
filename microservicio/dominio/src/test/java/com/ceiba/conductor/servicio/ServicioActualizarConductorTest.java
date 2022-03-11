package com.ceiba.conductor.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.conductor.modelo.entidad.Conductor;
import com.ceiba.conductor.puerto.repositorio.RepositorioConductor;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.conductor.servicio.testdatabuilder.ConductorTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioActualizarConductorTest {

    @Test
    @DisplayName("Deberia validar la existencia previa del Conductor")
    void deberiaValidarLaExistenciaPreviaDelUsuario() {
        // arrange
        Conductor conductor = new ConductorTestDataBuilder().conId(1L).build();
        RepositorioConductor repositorioConductor = Mockito.mock(RepositorioConductor.class);
        Mockito.when(repositorioConductor.existePorId(Mockito.anyLong())).thenReturn(false);
        ServicioActualizarConductor servicioActualizarConductor = new ServicioActualizarConductor(repositorioConductor);
        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarConductor.ejecutar(conductor), ExcepcionDuplicidad.class,"El Conductor no existe en el sistema");
    }

    @Test
    @DisplayName("Deberia actualizar correctamente en el repositorio")
    void deberiaActualizarCorrectamenteEnElRepositorio() {
        // arrange
        Conductor conductor = new ConductorTestDataBuilder().conId(1L).build();
        RepositorioConductor repositorioConductor = Mockito.mock(RepositorioConductor.class);
        Mockito.when(repositorioConductor.existePorId(Mockito.anyLong())).thenReturn(true);
        ServicioActualizarConductor servicioActualizarConductor = new ServicioActualizarConductor(repositorioConductor);
        // act
        servicioActualizarConductor.ejecutar(conductor);
        //assert
        Mockito.verify(repositorioConductor,Mockito.times(1)).actualizar(conductor);
    }
}
