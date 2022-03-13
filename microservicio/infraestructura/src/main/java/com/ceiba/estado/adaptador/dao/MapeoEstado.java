package com.ceiba.estado.adaptador.dao;

import com.ceiba.estadoservicio.modelo.dto.DtoEstado;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoEstado implements RowMapper<DtoEstado>, MapperResult {

    @Override
    public DtoEstado mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombre = resultSet.getString("nombre");
        Long idServicio = resultSet.getLong("idServicio");

        return new DtoEstado(id,nombre,idServicio);
    }

}
