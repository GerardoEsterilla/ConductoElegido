package com.ceiba.conductor.adaptador.dao;

import java.util.List;

import com.ceiba.conductor.modelo.dto.DtoConductor;
import com.ceiba.conductor.puerto.dao.DaoConductor;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;

import org.springframework.stereotype.Component;

@Component
public class DaoConductorMysql implements DaoConductor {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="conductor", value="listar")
    private static String sqlListar;

    public DaoConductorMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoConductor> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoConductor());
    }
}
