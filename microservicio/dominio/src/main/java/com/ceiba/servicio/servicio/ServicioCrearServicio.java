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
    private final RepositorioServicio repositorioServicio;

    public ServicioCrearServicio(RepositorioServicio repositorioServicio) {this.repositorioServicio = repositorioServicio;
    }

    public Long ejecutar(Servicio servicio) {
        validarExistenciaPrevia(servicio);
        Servicio servicio1 = new Servicio(null, null
                ,servicio.getIdCliente(),servicio.getOrigen(),servicio.getDestino(),
                servicio.getFechaServicio(),calcularValorServicio(servicio.getFechaServicio()),
                servicio.getDescripcion());
                return this.repositorioServicio.crear(servicio1);
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
        Long sobrecosto=0L;

        if (fechaServicio.getDayOfWeek()== DayOfWeek.SUNDAY || fechaServicio.getDayOfWeek()== DayOfWeek.SATURDAY ){
            sobrecosto+=5000;
        }

        if(fechaServicio.getHour()>=1 && fechaServicio.getHour()<=4){
            sobrecosto+=5000;
        }
        if(horaDiferencia<2){
            sobrecosto+=5000;
        }
        return TARIFA_BASE+sobrecosto;
    }

}
