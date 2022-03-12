package com.ceiba.estadoServicios.modelo.entidad;


import lombok.Getter;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;


@Getter
public class Estado {

    private static final String SE_DEBE_INGRESAR_EL_ESTADO = "Se debe ingresar el estado";
    private static final String SE_DEBE_INGRESAR_EL_SERVICIO = "Se debe ingresar el servicio";

    private Long id;
    private String estado ;
    private Long idServicio;

    public Estado(Long id, String estado, Long idServicio) {

        validarObligatorio(estado, SE_DEBE_INGRESAR_EL_ESTADO);
        validarObligatorio(idServicio, SE_DEBE_INGRESAR_EL_SERVICIO);

        this.id = id;
        this.estado = estado;
        this.idServicio = idServicio;
    }
}
