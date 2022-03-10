package com.ceiba.conductor.servicio;

import com.ceiba.conductor.modelo.entidad.Conductor;
import com.ceiba.conductor.puerto.repositorio.RepositorioConductor;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;

public class ServicioActualizarConductor {

    private static final String EL_CONDUCTOR_NO_EXISTE_EN_EL_SISTEMA = "El  conductor no existe en el sistema";

    private final RepositorioConductor repositorioConductor;

    public ServicioActualizarConductor(RepositorioConductor repositorioConductor) {
        this.repositorioConductor = repositorioConductor;
    }

    public void ejecutar(Conductor conductor) {
        validarExistenciaPrevia(conductor);
        this.repositorioConductor.actualizar(conductor);
    }

    private void validarExistenciaPrevia(Conductor conductor) {
        boolean existe = this.repositorioConductor.existePorId(conductor.getId());
        if(!existe) {
            throw new ExcepcionDuplicidad(EL_CONDUCTOR_NO_EXISTE_EN_EL_SISTEMA);
        }
    }
}
