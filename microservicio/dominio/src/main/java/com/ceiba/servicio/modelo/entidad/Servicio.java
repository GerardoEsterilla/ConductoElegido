package com.ceiba.servicio.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Servicio {

    private static final String SE_DEBE_INGRESAR_EL_CONDUCTOR = "Se debe ingresar el idConductor";
    private static final String SE_DEBE_INGRESAR_EL_CLIENTE = "Se debe ingresar el idCliente";
    private static final String SE_DEBE_INGRESAR_EL_ORIGEN = "Se debe ingresar el origen del servicio";
    private static final String SE_DEBE_INGRESAR_EL_DESTINO = "Se debe ingresar el destino del servicio";
    private static final String SE_DEBE_INGRESAR_LA_FECHA_SERVICIO = "Se debe ingresar la fechaServicio";
    private static final String SE_DEBE_INGRESAR_EL_VALOR = "Se debe ingresar el valor del servicio";
    private static final String SE_DEBE_INGRESAR_LA_DESCRIPCION = "Se debe ingresar la descripcion del servicio";

    private Long id;
    private Long idCliente;
    private String origen;
    private String destino;
    private LocalDateTime fechaServicio;
    private String descripcion;
    @Setter
    private Long valor;
    @Setter
    private Long idConductor;


    public Servicio(Long id, Long idCliente, String origen, String destino, LocalDateTime fechaServicio, String descripcion) {

        validarObligatorio(idCliente, SE_DEBE_INGRESAR_EL_CLIENTE);
        validarObligatorio(origen, SE_DEBE_INGRESAR_EL_ORIGEN);
        validarObligatorio(destino, SE_DEBE_INGRESAR_EL_DESTINO);
        validarObligatorio(fechaServicio, SE_DEBE_INGRESAR_LA_FECHA_SERVICIO);
        validarObligatorio(descripcion, SE_DEBE_INGRESAR_LA_DESCRIPCION);



        this.id = id;
        this.idConductor = null;
        this.idCliente = idCliente;
        this.origen = origen;
        this.destino=destino;
        this.fechaServicio = fechaServicio;
        this.valor = null;
        this.descripcion= descripcion;
    }



}
