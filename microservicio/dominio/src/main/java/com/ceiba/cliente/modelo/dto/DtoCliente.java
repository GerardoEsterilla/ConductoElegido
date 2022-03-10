package com.ceiba.cliente.modelo.dto;

import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class DtoCliente {
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private String cedula;
    private String email;
    private List<Vehiculo> listaVehiculo;

}
