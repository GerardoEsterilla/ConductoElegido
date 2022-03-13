package com.ceiba.estado.adaptador.dao;

import com.ceiba.estadoservicio.modelo.dto.DtoEstado;
import com.ceiba.estadoservicio.puerto.dao.DaoEstado;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoEstadoMysql implements DaoEstado {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="estado", value="listar")
    private static String sqlListar;

    public DaoEstadoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoEstado> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoEstado());
    }
}
