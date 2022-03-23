package com.ceiba.conductor.puerto.repositorio;

import com.ceiba.conductor.modelo.entidad.Conductor;

public interface RepositorioConductor {
    /**
     * Permite crear un conductor
     * @param conductor
     * @return el id generado
     */
    Long crear(Conductor conductor);

    /**
     * Permite actualizar un conductor
     * @param conductor
     */
    void actualizar(Conductor conductor);

    /**
     * Permite eliminar un conductor
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe un conductor con un nombre
     * @param cedula
     * @return si existe o no
     */
    boolean existe(String cedula);

    /**
     * Permite validar si existe un conductor con un nombre excluyendo un id
     * @return si existe o no
     */
    boolean existePorId(Long id);
}
