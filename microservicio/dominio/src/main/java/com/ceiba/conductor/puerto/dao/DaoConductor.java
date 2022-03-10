package com.ceiba.conductor.puerto.dao;

import com.ceiba.conductor.modelo.dto.DtoConductor;

import java.util.List;

public interface DaoConductor {
    /**
     * Permite listar Conductores
     * @return los conductores
     */
    List<DtoConductor> listar();
}
