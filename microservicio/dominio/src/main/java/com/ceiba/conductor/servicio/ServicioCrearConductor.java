package com.ceiba.conductor.servicio;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.conductor.modelo.entidad.Conductor;
import com.ceiba.conductor.puerto.repositorio.RepositorioConductor;

public class ServicioCrearConductor {
    private static final String EL_CONDUCTOR_YA_EXISTE_EN_EL_SISTEMA = "El conductor ya existe en el sistema";

    private final RepositorioConductor repositorioConductor;

    public ServicioCrearConductor(RepositorioConductor repositorioConductor) {this.repositorioConductor = repositorioConductor;
    }

    public Long ejecutar(Conductor conductor) {
        validarExistenciaPrevia(conductor);
        return this.repositorioConductor.crear(conductor);
    }

    private void validarExistenciaPrevia(Conductor conductor) {
        boolean existe = this.repositorioConductor.existe(conductor.getNombre());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_CONDUCTOR_YA_EXISTE_EN_EL_SISTEMA);
        }
    }

}
