package com.ceiba.servicio.configuracion;


import com.ceiba.servicio.puerto.repositorio.RepositorioServicio;
import com.ceiba.servicio.servicio.ServicioActualizarServicio;
import com.ceiba.servicio.servicio.ServicioCrearServicio;
import com.ceiba.servicio.servicio.ServicioEliminarServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioServicio {

    @Bean
    public ServicioCrearServicio servicioCrearServicio(RepositorioServicio repositorioServicio) {
        return new ServicioCrearServicio(repositorioServicio);
    }

    @Bean
    public ServicioEliminarServicio servicioEliminarServicio(RepositorioServicio repositorioServicio) {
        return new ServicioEliminarServicio(repositorioServicio);
    }

    @Bean
    public ServicioActualizarServicio servicioActualizarServicio (RepositorioServicio repositorioServicio) {
        return new ServicioActualizarServicio(repositorioServicio);
    }
	

}
