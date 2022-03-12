package com.ceiba.cliente.modelo.entidad;

import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Cliente {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_CLIENTE = "Se debe ingresar el nombre de cliente";
    private static final String SE_DEBE_INGRESAR_EL_APELLIDO_DE_CLIENTE = "Se debe ingresar el apellido de cliente";
    private static final String SE_DEBE_INGRESAR_LA_FECHA_NACIMIENTO_DE_CLIENTE = "Se debe ingresar la fecha_nacimiento de cliente";
    private static final String SE_DEBE_INGRESAR_LA_CEDULA_DE_CLIENTE = "Se debe ingresar la cedula de cliente";
    private static final String SE_DEBE_INGRESAR_EL_EMAIL_DE_CLIENTE = "Se debe ingresar el email de cliente";
    private static final String SE_DEBE_INGRESAR_EL_VEHICULO_DE_CLIENTE = "Se debe ingresar el vehiculo de cliente";

    private Long id;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private String cedula;
    private String email;
    /**private List<Vehiculo> listaVehiculo;**/


    public Cliente(Long id, String nombre, String apellido, LocalDateTime fechaNacimiento, String cedula, String email) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_CLIENTE);
        validarObligatorio(apellido,SE_DEBE_INGRESAR_EL_APELLIDO_DE_CLIENTE);
        validarObligatorio(fechaNacimiento,SE_DEBE_INGRESAR_LA_FECHA_NACIMIENTO_DE_CLIENTE);
        validarObligatorio(cedula, SE_DEBE_INGRESAR_LA_CEDULA_DE_CLIENTE);
        validarObligatorio(email, SE_DEBE_INGRESAR_EL_EMAIL_DE_CLIENTE);
        /**validarObligatorio(listaVehiculo, SE_DEBE_INGRESAR_EL_VEHICULO_DE_CLIENTE);**/
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.email = email;
        /** this.listaVehiculo= listaVehiculo;**/
    }
}
