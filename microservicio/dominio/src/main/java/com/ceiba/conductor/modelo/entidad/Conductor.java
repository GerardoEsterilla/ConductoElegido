package com.ceiba.conductor.modelo.entidad;

import lombok.Getter;

import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Conductor {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_CONDUCTOR = "Se debe ingresar el nombre de conductor";
    private static final String SE_DEBE_INGRESAR_EL_APELLIDO_DE_CONDUCTOR = "Se debe ingresar el apellido de conductor";
    private static final String SE_DEBE_INGRESAR_LA_FECHA_NACIMIENTO_DE_CONDUCTOR = "Se debe ingresar la fechaNacimiento de conductor";
    private static final String SE_DEBE_INGRESAR_LA_CEDULA_DE_CONDUCTOR = "Se debe ingresar la cedula de conductor";
    private static final String SE_DEBE_INGRESAR_EL_EMAIL_DE_CONDUCTOR = "Se debe ingresar el email de conductor";
    private static final String SE_DEBE_INGRESAR_EL_TELEFONO_DE_CONDUCTOR = "Se debe ingresar el telefono de conductor";
    private static final String SE_DEBE_INGRESAR_LA_FOTO_DE_CONDUCTOR = "Se debe ingresar la foto de conductor";

    private Long id;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private String cedula;
    private String email;
    private String telefono;
    private String foto;


    public Conductor(Long id, String nombre, String apellido, LocalDateTime fechaNacimiento, String cedula, String email, String telefono, String foto) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_CONDUCTOR);
        validarObligatorio(apellido,SE_DEBE_INGRESAR_EL_APELLIDO_DE_CONDUCTOR);
        validarObligatorio(fechaNacimiento,SE_DEBE_INGRESAR_LA_FECHA_NACIMIENTO_DE_CONDUCTOR);
        validarObligatorio(cedula, SE_DEBE_INGRESAR_LA_CEDULA_DE_CONDUCTOR);
        validarObligatorio(email, SE_DEBE_INGRESAR_EL_EMAIL_DE_CONDUCTOR);
        validarObligatorio(telefono, SE_DEBE_INGRESAR_EL_TELEFONO_DE_CONDUCTOR);
        validarObligatorio(foto, SE_DEBE_INGRESAR_LA_FOTO_DE_CONDUCTOR);

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.foto = foto;
    }
}
