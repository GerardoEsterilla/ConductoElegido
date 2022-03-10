package com.ceiba.estadoServicios.servicio;

import com.ceiba.conductor.modelo.entidad.Conductor;
import com.ceiba.conductor.puerto.repositorio.RepositorioConductor;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.estadoServicios.modelo.entidad.Estado;
import com.ceiba.estadoServicios.puerto.repositorio.RepositorioEstado;

public class ServicioActualizarEstado {

    private static final String EL_ESTADO_YA_EXISTE_EN_EL_SISTEMA = "El estado ya existe en el sistema";

    private final RepositorioEstado repositorioEstado;

    public ServicioActualizarEstado(RepositorioEstado repositorioEstado) {this.repositorioEstado = repositorioEstado;
    }

    public void ejecutar(Estado estado) {
        validarExistenciaPrevia(estado);
        this.repositorioEstado.actualizar(estado);
    }

    private void validarExistenciaPrevia(Estado estado) {
        boolean existe = this.repositorioEstado.existePorId(estado.getId());
        if(!existe) {
            throw new ExcepcionDuplicidad(EL_ESTADO_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
