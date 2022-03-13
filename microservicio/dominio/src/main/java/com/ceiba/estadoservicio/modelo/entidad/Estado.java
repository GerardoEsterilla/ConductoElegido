package com.ceiba.estadoservicio.modelo.entidad;


import lombok.Getter;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;


@Getter
public class Estado {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_ESTADO = "Se debe ingresar el nombre de estado";
    private static final String SE_DEBE_INGRESAR_EL_SERVICIO = "Se debe ingresar el servicio";

    private Long id;
    private String nombre ;
    private Long idServicio;

    public Estado(Long id, String nombre, Long idServicio) {

        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_ESTADO);
        validarObligatorio(idServicio, SE_DEBE_INGRESAR_EL_SERVICIO);

        this.id = id;
        this.nombre = nombre;
        this.idServicio = idServicio;
    }
}
