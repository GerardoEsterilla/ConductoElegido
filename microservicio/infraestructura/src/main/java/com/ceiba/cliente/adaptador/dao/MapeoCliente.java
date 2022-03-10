package com.ceiba.cliente.adaptador.dao;

import com.ceiba.cliente.modelo.dto.DtoCliente;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class MapeoCliente implements RowMapper<DtoCliente>, MapperResult {

    @Override
    public DtoCliente mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombre = resultSet.getString("nombre");
        String apellido = resultSet.getString("apellido");
        LocalDateTime fechaNacimiento = extraerLocalDateTime(resultSet, "fechaNacimiento");
        String cedula = resultSet.getString("cedula");
        String email = resultSet.getString("email");
        /**Falta Vehiculo**/
        return new DtoCliente(id,nombre,apellido,fechaNacimiento,cedula,email,null);
    }

}
