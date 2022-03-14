package com.ceiba.servicio.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.servicio.modelo.entidad.Servicio;
import com.ceiba.servicio.puerto.repositorio.RepositorioServicio;
import com.ceiba.servicio.servicio.testdatabuilder.ServicioTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioCrearServicioTest {

    @Test
    @DisplayName("Deberia lanzar una excepcion cuando se valide la existencia del Servicio")
    void deberiaLanzarUnaExepcionCuandoSeValideLaExistenciaDelServicio() {
        // arrange
        Servicio servicio = new ServicioTestDataBuilder().build();
        RepositorioServicio repositorioServicio = Mockito.mock(RepositorioServicio.class);
        Mockito.when(repositorioServicio.existe(Mockito.anyString())).thenReturn(true);
        ServicioCrearServicio servicioCrearServicio = new ServicioCrearServicio(repositorioServicio);
        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearServicio.ejecutar(servicio), ExcepcionDuplicidad.class,"El servicio ya existe en el sistema");
    }

    @Test
    @DisplayName("Deberia Crear el servicio de manera correcta")
    void deberiaCrearElServicioDeManeraCorrecta() {
        // arrange
        Servicio servicio = new ServicioTestDataBuilder().build();
        RepositorioServicio repositorioServicio = Mockito.mock(RepositorioServicio.class);
        Mockito.when(repositorioServicio.existe(Mockito.anyString())).thenReturn(false);
        Mockito.when(repositorioServicio.crear(servicio)).thenReturn(10L);
        ServicioCrearServicio servicioCrearServicio = new ServicioCrearServicio(repositorioServicio);
        // act
        Long idServicio = servicioCrearServicio.ejecutar(servicio);
        //- assert
        assertEquals(10L,idServicio);
        Mockito.verify(repositorioServicio, Mockito.times(1)).crear(servicio);
    }
}
