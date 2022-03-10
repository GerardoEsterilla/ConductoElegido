package com.ceiba.servicio.comando;

import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.conductor.modelo.entidad.Conductor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoServicio {

    private Long id;
    private Long id_conductor;
    private Long id_cliente;
    private String origen;
    private String destino;
    private LocalDateTime fechaServicio;
    private Long valor;
    private String descripcion;

}
