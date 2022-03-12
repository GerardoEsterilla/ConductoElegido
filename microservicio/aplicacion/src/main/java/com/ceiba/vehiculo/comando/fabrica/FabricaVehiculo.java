package com.ceiba.vehiculo.comando.fabrica;

import com.ceiba.vehiculo.comando.ComandoVehiculo;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import org.springframework.stereotype.Component;

@Component
public class FabricaVehiculo {

    public Vehiculo crear(ComandoVehiculo comandoVehiculo) {
        return new Vehiculo(
                comandoVehiculo.getId(),
                comandoVehiculo.getMarca(),
                comandoVehiculo.getModelo(),
                comandoVehiculo.getPlaca(),
                comandoVehiculo.getIdCliente()
                );
    }

}
