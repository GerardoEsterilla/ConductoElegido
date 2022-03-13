package com.ceiba.estadoservicio.puerto.repositorio;

import com.ceiba.estadoservicio.modelo.entidad.Estado;

public interface RepositorioEstado {
    /**
     * Permite crear un estado
     * @param estado
     * @return el id generado
     */
    Long crear(Estado estado);

    /**
     * Permite actualizar un estado
     * @param estado
     */
    void actualizar(Estado estado);

    /**
     * Permite validar si existe un estado
     * @param estado
     * @return si existe o no
     */
    boolean existe(String estado);

    /**
     * Permite validar si existe un estado excluyendo un id
     * @return si existe o no
     */
    boolean existePorId(Long id);
}
