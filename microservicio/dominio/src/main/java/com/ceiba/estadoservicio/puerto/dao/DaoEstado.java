package com.ceiba.estadoservicio.puerto.dao;

import com.ceiba.estadoservicio.modelo.dto.DtoEstado;

import java.util.List;

public interface DaoEstado {
    /**
     * Permite listar Estados
     * @return los estado
     */
    List<DtoEstado> listar();
}
