package com.ceiba.estado.configuracion;

import com.ceiba.estadoServicios.puerto.repositorio.RepositorioEstado;
import com.ceiba.estadoServicios.servicio.ServicioActualizarEstado;
import com.ceiba.estadoServicios.servicio.ServicioCrearEstado;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import com.ceiba.vehiculo.servicio.ServicioActualizarVehiculo;
import com.ceiba.vehiculo.servicio.ServicioCrearVehiculo;
import com.ceiba.vehiculo.servicio.ServicioEliminarVehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioEstado {

    @Bean
    public ServicioCrearEstado servicioCrearEstado(RepositorioEstado repositorioEstado) {
        return new ServicioCrearEstado(repositorioEstado);
    }

    @Bean
    public ServicioActualizarEstado servicioActualizarEstado (RepositorioEstado repositorioEstado) {
        return new ServicioActualizarEstado(repositorioEstado);
    }
	

}
