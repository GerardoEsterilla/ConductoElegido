package com.ceiba.conductor.adaptador.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import com.ceiba.conductor.modelo.dto.DtoConductor;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

public class MapeoConductor implements RowMapper<DtoConductor>, MapperResult {

    @Override
    public DtoConductor mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombre = resultSet.getString("nombre");
        String apellido = resultSet.getString("apellido");
        LocalDateTime fechaNacimiento = extraerLocalDateTime(resultSet, "fechaNacimiento");
        String cedula = resultSet.getString("cedula");
        String email = resultSet.getString("email");
        String telefono = resultSet.getString("telefono");
        String foto = resultSet.getString("foto");




        return new DtoConductor(id,nombre,apellido,fechaNacimiento,cedula,email,telefono,foto);
    }

}
