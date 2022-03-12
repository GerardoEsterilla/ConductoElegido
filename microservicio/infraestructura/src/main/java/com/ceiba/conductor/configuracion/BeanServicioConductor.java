package com.ceiba.conductor.configuracion;

import com.ceiba.conductor.puerto.dao.DaoConductor;
import com.ceiba.conductor.puerto.repositorio.RepositorioConductor;
import com.ceiba.conductor.servicio.ServicioActualizarConductor;
import com.ceiba.conductor.servicio.ServicioCrearConductor;
import com.ceiba.conductor.servicio.ServicioEliminarConductor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioConductor {

    @Bean
    public ServicioCrearConductor servicioCrearConductor(RepositorioConductor repositorioConductor) {
        return new ServicioCrearConductor(repositorioConductor);
    }

    @Bean
    public ServicioEliminarConductor servicioEliminarConductor(RepositorioConductor repositorioConductor) {
        return new ServicioEliminarConductor(repositorioConductor);
    }

    @Bean
    public ServicioActualizarConductor servicioActualizarConductor (RepositorioConductor repositorioConductor) {
        return new ServicioActualizarConductor(repositorioConductor);
    }
	

}
