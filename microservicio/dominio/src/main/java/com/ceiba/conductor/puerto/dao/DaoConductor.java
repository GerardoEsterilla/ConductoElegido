package com.ceiba.conductor.puerto.dao;

import com.ceiba.cliente.modelo.dto.DtoCliente;
import com.ceiba.conductor.modelo.dto.DtoConductor;

import java.util.List;

public interface DaoConductor {
    /**
     * Permite listar Conductores
     * @return los conductores
     */
    List<DtoConductor> listar();
    DtoConductor listarCedula(String cedula);

}
