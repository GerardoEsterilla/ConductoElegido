package com.ceiba.estadoServicios.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoEstado {
    private Long id;
    private String estado ;
    private Long idServicio;
}
