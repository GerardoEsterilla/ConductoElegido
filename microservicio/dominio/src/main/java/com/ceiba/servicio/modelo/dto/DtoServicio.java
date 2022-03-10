package com.ceiba.servicio.modelo.dto;

import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.conductor.modelo.entidad.Conductor;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class DtoServicio {
    private Long id;
    private Long id_conductor;
    private Long id_cliente;
    private String origen;
    private String destino;
    private LocalDateTime fechaServicio;
    private Long valor;
    private String descripcion;
}
