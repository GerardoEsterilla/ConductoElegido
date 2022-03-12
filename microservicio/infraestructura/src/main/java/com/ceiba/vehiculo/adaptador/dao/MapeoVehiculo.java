package com.ceiba.vehiculo.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.vehiculo.modelo.dto.DtoVehiculo;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoVehiculo implements RowMapper<DtoVehiculo>, MapperResult {

    @Override
    public DtoVehiculo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String marca = resultSet.getString("marca");
        String modelo = resultSet.getString("modelo");
        String placa = resultSet.getString("placa");
        Long idCliente = resultSet.getLong("idCliente");


        return new DtoVehiculo(id,marca,modelo,placa,idCliente);
    }

}
