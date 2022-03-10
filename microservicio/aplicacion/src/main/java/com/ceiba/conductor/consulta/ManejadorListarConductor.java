package com.ceiba.conductor.consulta;

import java.util.List;

import com.ceiba.conductor.modelo.dto.DtoConductor;
import com.ceiba.conductor.puerto.dao.DaoConductor;
import org.springframework.stereotype.Component;

@Component
public class ManejadorListarConductor {

    private final DaoConductor daoConductor;

    public ManejadorListarConductor(DaoConductor daoConductor){
        this.daoConductor = daoConductor;
    }

    public List<DtoConductor> ejecutar(){ return this.daoConductor.listar(); }
}
