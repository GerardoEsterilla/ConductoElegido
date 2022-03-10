package com.ceiba.conductor.servicio;

import com.ceiba.conductor.puerto.repositorio.RepositorioConductor;

public class ServicioEliminarConductor {

    private final RepositorioConductor repositorioConductor;

    public ServicioEliminarConductor(RepositorioConductor repositorioConductor) {
        this.repositorioConductor = repositorioConductor;
    }

    public void ejecutar(Long id) {
        this.repositorioConductor.eliminar(id);
    }
}
