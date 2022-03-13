package com.ceiba.estado.consulta;

import com.ceiba.estadoservicio.modelo.dto.DtoEstado;
import com.ceiba.estadoservicio.puerto.dao.DaoEstado;
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
