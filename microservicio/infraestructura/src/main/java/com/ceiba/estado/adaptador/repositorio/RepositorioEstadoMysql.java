package com.ceiba.estado.adaptador.repositorio;

import com.ceiba.estadoservicio.modelo.entidad.Estado;
import com.ceiba.estadoservicio.puerto.repositorio.RepositorioEstado;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioEstadoMysql implements RepositorioEstado {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="estado", value="crear")
    private static String sqlCrear;

    @SqlStatement(namespace="estado", value="actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace="estado", value="existe")
    private static String sqlExiste;

    @SqlStatement(namespace="estado", value="existePorId")
    private static String sqlExistePorId;

    public RepositorioEstadoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(Estado estado) {
        return this.customNamedParameterJdbcTemplate.crear(estado, sqlCrear);
    }

    @Override
    public void actualizar(Estado estado) {
        this.customNamedParameterJdbcTemplate.actualizar(estado, sqlActualizar);
    }

    @Override
    public boolean existe(String estado) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("nombre", estado);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste,paramSource, Boolean.class);
    }

    @Override
    public boolean existePorId(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExistePorId,paramSource, Boolean.class);
    }
}
