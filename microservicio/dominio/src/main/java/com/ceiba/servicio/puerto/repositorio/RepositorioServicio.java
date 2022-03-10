package com.ceiba.servicio.puerto.repositorio;

import com.ceiba.conductor.modelo.entidad.Conductor;
import com.ceiba.servicio.modelo.entidad.Servicio;

public interface RepositorioServicio {

    /**
     * Permite crear un servicio
     * @param servicio
     * @return el id generado
     */
    Long crear(Servicio servicio);

    /**
     * Permite actualizar un servicio
     * @param servicio
     */
    void actualizar(Servicio servicio);

    /**
     * Permite eliminar un servicio
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe un servicio con un Origen
     * @param origen
     * @return si existe o no
     */
    boolean existe(String origen);

    /**
     * Permite validar si existe un servicio con un Origen excluyendo un id
     * @return si existe o no
     */
    boolean existePorId(Long id);
}
