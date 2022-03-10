package com.ceiba.servicio.modelo.entidad;

import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.conductor.modelo.entidad.Conductor;
import lombok.Getter;

import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Servicio {

    private static final String SE_DEBE_INGRESAR_EL_CONDUCTOR_ = "Se debe ingresar el conductor";
    private static final String SE_DEBE_INGRESAR_EL_CLIENTE = "Se debe ingresar el cliente";
    private static final String SE_DEBE_INGRESAR_EL_ORIGEN = "Se debe ingresar el origen del servicio";
    private static final String SE_DEBE_INGRESAR_EL_DESTINO = "Se debe ingresar el destino del servicio";
    private static final String SE_DEBE_INGRESAR_LA_FECHA_SERVICIO = "Se debe ingresar la fecha de servicio";
    private static final String SE_DEBE_INGRESAR_EL_VALOR = "Se debe ingresar el valor del servicio";
    private static final String SE_DEBE_INGRESAR_LA_DESCRIPCION = "Se debe ingresar la descripcion del servicio";

    private Long id;
    private Long id_conductor;
    private Long id_cliente;
    private String origen;
    private String destino;
    private LocalDateTime fechaServicio;
    private Long valor;
    private String descripcion;

    public Servicio(Long id, Long id_conductor, Long id_cliente, String origen, String destino, LocalDateTime fechaServicio, Long valor, String descripcion) {
        validarObligatorio(id_conductor, SE_DEBE_INGRESAR_EL_CONDUCTOR_);
        validarObligatorio(id_cliente, SE_DEBE_INGRESAR_EL_CLIENTE);
        validarObligatorio(origen, SE_DEBE_INGRESAR_EL_ORIGEN);
        validarObligatorio(destino, SE_DEBE_INGRESAR_EL_DESTINO);
        validarObligatorio(fechaServicio, SE_DEBE_INGRESAR_LA_FECHA_SERVICIO);
        validarObligatorio(valor, SE_DEBE_INGRESAR_EL_VALOR);
        validarObligatorio(descripcion, SE_DEBE_INGRESAR_LA_DESCRIPCION);



        this.id = id;
        this.id_conductor = id_conductor;
        this.id_cliente = id_cliente;
        this.origen = origen;
        this.destino=destino;
        this.fechaServicio = fechaServicio;
        this.valor = valor;
        this.descripcion= descripcion;
    }
}
