package com.ceiba.estado.consulta;

import com.ceiba.estadoServicios.modelo.dto.DtoEstado;
import com.ceiba.estadoServicios.puerto.dao.DaoEstado;
import com.ceiba.vehiculo.modelo.dto.DtoVehiculo;
import com.ceiba.vehiculo.puerto.dao.DaoVehiculo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarEstado {

    private final DaoEstado daoEstado;

    public ManejadorListarEstado(DaoEstado daoEstado){
        this.daoEstado = daoEstado;
    }

    public List<DtoEstado> ejecutar(){ return this.daoEstado.listar(); }
}
