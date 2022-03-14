package com.ceiba.estadoservicio.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.estadoservicio.modelo.entidad.Estado;
import com.ceiba.estadoservicio.puerto.repositorio.RepositorioEstado;
import com.ceiba.estadoservicio.servicio.testdatabuilder.EstadoTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioActualizarEstadoTest {

    @Test
    @DisplayName("Deberia validar la existencia previa del estado")
    void deberiaValidarLaExistenciaPreviaDelEstado() {
        // arrange
        Estado estado = new EstadoTestDataBuilder().conId(1L).build();
        RepositorioEstado repositorioEstado = Mockito.mock(RepositorioEstado.class);
        Mockito.when(repositorioEstado.existePorId(Mockito.anyLong())).thenReturn(false);
        ServicioActualizarEstado servicioActualizarEstado = new ServicioActualizarEstado(repositorioEstado);
        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarEstado.ejecutar(estado), ExcepcionDuplicidad.class,"El estado ya existe en el sistema");
    }

    @Test
    @DisplayName("Deberia actualizar correctamente en el estado")
    void deberiaActualizarCorrectamenteEnElRepositorio() {
        // arrange
        Estado estado = new EstadoTestDataBuilder().conId(1L).build();
        RepositorioEstado repositorioEstado = Mockito.mock(RepositorioEstado.class);
        Mockito.when(repositorioEstado.existePorId(Mockito.anyLong())).thenReturn(true);
        ServicioActualizarEstado servicioActualizarEstado = new ServicioActualizarEstado(repositorioEstado);
        // act
        servicioActualizarEstado.ejecutar(estado);
        //assert
        Mockito.verify(repositorioEstado,Mockito.times(1)).actualizar(estado);
    }
}
