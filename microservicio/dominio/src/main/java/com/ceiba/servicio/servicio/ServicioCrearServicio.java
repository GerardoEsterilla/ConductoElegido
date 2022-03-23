package com.ceiba.servicio.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.servicio.modelo.entidad.Servicio;
import com.ceiba.servicio.puerto.repositorio.RepositorioServicio;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ServicioCrearServicio {
    private static final String EL_SERVICIO_YA_EXISTE_EN_EL_SISTEMA = "El servicio ya existe en el sistema";
    private static final Long TARIFA_BASE= 10000L;
    private static final Long SOBRECOSTO=5000L;
    private static final Long HORA_MIN_DIFERENCIA= 2L;
    private final RepositorioServicio repositorioServicio;

    public ServicioCrearServicio(RepositorioServicio repositorioServicio) {this.repositorioServicio = repositorioServicio;
    }

    public Long ejecutar(Servicio servicio) {
        validarExistenciaPrevia(servicio);
        servicio.setValor(calcularValorServicio(servicio.getFechaServicio()));
        return this.repositorioServicio.crear(servicio);
    }

    private void validarExistenciaPrevia(Servicio servicio) {
        boolean existe = this.repositorioServicio.existe(servicio.getDescripcion());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_SERVICIO_YA_EXISTE_EN_EL_SISTEMA);
        }
    }

    private Long calcularValorServicio(LocalDateTime fechaServicio){
        LocalDateTime fechaActual = LocalDateTime.now();
        Long horaDiferencia =ChronoUnit.HOURS.between(fechaActual,fechaServicio);
        Long total = 0L;

        if (esFinDeSemana(fechaServicio)){
            total+=SOBRECOSTO;
        }

        if(esEnMadrugada(fechaServicio)){
            total+=SOBRECOSTO;
        }
        if(horaDiferencia<HORA_MIN_DIFERENCIA){
            total+=SOBRECOSTO;
        }
        return TARIFA_BASE+total;
    }

    private Boolean esFinDeSemana(LocalDateTime fechaServicio){
        if (fechaServicio.getDayOfWeek()== DayOfWeek.SUNDAY || fechaServicio.getDayOfWeek()== DayOfWeek.SATURDAY ){
            return true;
        }else{
            return false;
        }
    }

    private Boolean esEnMadrugada(LocalDateTime fechaServicio){
        if(fechaServicio.getHour()>=1 && fechaServicio.getHour()<=4){
            return true;
        }else{
            return false;
        }
    }

}
