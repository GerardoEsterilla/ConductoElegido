package com.ceiba.cliente.configuracion;

import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.cliente.servicio.ServicioActualizarCliente;
import com.ceiba.cliente.servicio.ServicioCrearCliente;
import com.ceiba.cliente.servicio.ServicioEliminarCliente;
import com.ceiba.conductor.puerto.repositorio.RepositorioConductor;
import com.ceiba.conductor.servicio.ServicioActualizarConductor;
import com.ceiba.conductor.servicio.ServicioCrearConductor;
import com.ceiba.conductor.servicio.ServicioEliminarConductor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioCliente {

    @Bean
    public ServicioCrearCliente servicioCrearCliente(RepositorioCliente repositorioCliente) {
        return new ServicioCrearCliente(repositorioCliente);
    }

    @Bean
    public ServicioEliminarCliente servicioEliminarCliente(RepositorioCliente repositorioCliente) {
        return new ServicioEliminarCliente(repositorioCliente);
    }

    @Bean
    public ServicioActualizarCliente servicioActualizarCliente (RepositorioCliente repositorioCliente) {
        return new ServicioActualizarCliente(repositorioCliente);
    }
	

}
