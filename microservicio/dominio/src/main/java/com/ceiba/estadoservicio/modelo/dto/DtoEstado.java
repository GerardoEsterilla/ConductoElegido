package com.ceiba.estadoservicio.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoEstado {
    private Long id;
    private String nombre ;
    private Long idServicio;
}
