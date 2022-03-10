package com.ceiba.cliente.puerto.dao;

import com.ceiba.cliente.modelo.dto.DtoCliente;
import com.ceiba.conductor.modelo.dto.DtoConductor;

import java.util.List;

public interface DaoCliente {
    /**
     * Permite listar Clientes
     * @return los clientes
     */
    List<DtoCliente> listar();
}
