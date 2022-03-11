package com.ceiba.conductor.servicio;

import com.ceiba.conductor.puerto.repositorio.RepositorioConductor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioEliminarConductorTest {

    @Test
    @DisplayName("Deberia eliminar el conductor llamando al repositorio")
    void deberiaEliminarElConductorLlamandoAlRepositorio() {
        RepositorioConductor repositorioConductor = Mockito.mock(RepositorioConductor.class);
        ServicioEliminarConductor servicioEliminarConductor = new ServicioEliminarConductor(repositorioConductor);

        servicioEliminarConductor.ejecutar(1l);

        Mockito.verify(repositorioConductor, Mockito.times(1)).eliminar(1l);

    }

}
