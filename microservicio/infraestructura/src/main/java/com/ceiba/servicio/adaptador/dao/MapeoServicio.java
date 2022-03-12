package com.ceiba.servicio.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.servicio.modelo.dto.DtoServicio;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class MapeoServicio implements RowMapper<DtoServicio>, MapperResult {

    @Override
    public DtoServicio mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        Long idConductor = resultSet.getLong("idConductor");
        Long idCliente = resultSet.getLong("idCliente");
        String origen = resultSet.getString("origen");
        String destino = resultSet.getString("destino");
        LocalDateTime fechaServicio = extraerLocalDateTime(resultSet, "fechaServicio");
        Long valor = resultSet.getLong("valor");
        String descripcion = resultSet.getString("descripcion");


        return new DtoServicio(id,idConductor,idCliente,origen,destino,fechaServicio, valor , descripcion);
    }

}
