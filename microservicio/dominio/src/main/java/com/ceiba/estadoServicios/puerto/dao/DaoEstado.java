package com.ceiba.estadoServicios.puerto.dao;

import com.ceiba.estadoServicios.modelo.dto.DtoEstado;

import java.util.List;

public interface DaoEstado {
    /**
     * Permite listar Estados
     * @return los estado
     */
    List<DtoEstado> listar();
}
