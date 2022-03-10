package com.ceiba.estadoServicios.modelo.entidad;


import lombok.Getter;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;


@Getter
public class Estado {

    private static final String SE_DEBE_INGRESAR_EL_ESTADO_ = "Se debe ingresar el estado";
    private static final String SE_DEBE_INGRESAR_EL_SERVICIO = "Se debe ingresar el servicio";

    private Long id;
    private String estado ;
    private Long id_servicio;

    public Estado(Long id, String estado, Long id_servicio) {

        validarObligatorio(estado, SE_DEBE_INGRESAR_EL_ESTADO_);
        validarObligatorio(id_servicio, SE_DEBE_INGRESAR_EL_SERVICIO);

        this.id = id;
        this.estado = estado;
        this.id_servicio = id_servicio;
    }
}
