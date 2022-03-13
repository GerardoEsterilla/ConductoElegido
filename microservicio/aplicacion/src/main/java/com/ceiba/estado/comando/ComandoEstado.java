package com.ceiba.estado.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoEstado {

    private Long id;
    private String nombre ;
    private Long idServicio;

}
