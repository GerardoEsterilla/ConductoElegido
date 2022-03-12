package com.ceiba.estado.adaptador.dao;

import com.ceiba.estadoServicios.modelo.dto.DtoEstado;
import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.vehiculo.modelo.dto.DtoVehiculo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoEstado implements RowMapper<DtoEstado>, MapperResult {

    @Override
    public DtoEstado mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String estado = resultSet.getString("estado");
        Long idServicio = resultSet.getLong("idServicio");

        return new DtoEstado(id,estado,idServicio);
    }

}
