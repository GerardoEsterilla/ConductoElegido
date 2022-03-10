package com.ceiba.conductor.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class DtoConductor {
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private String cedula;
    private String email;
    private String telefono;
    private String foto;
}
