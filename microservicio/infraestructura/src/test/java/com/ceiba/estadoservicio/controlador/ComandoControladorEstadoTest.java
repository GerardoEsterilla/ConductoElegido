package com.ceiba.estadoservicio.controlador;

import com.ceiba.ApplicationMock;
import com.ceiba.estado.comando.ComandoEstado;
import com.ceiba.estado.controlador.ComandoControladorEstado;
import com.ceiba.estadoservicio.testdatabuilder.ComandoEstadoTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ComandoControladorEstado.class)
@ContextConfiguration(classes= ApplicationMock.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ComandoControladorEstadoTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Test
    @Order(1)
    @DisplayName("Deberia crear un estado")
    void deberiaCrearElEstadoDeManeraCorrecta() throws Exception{
        // arrange
        ComandoEstado estado = new ComandoEstadoTestDataBuilder().build();
        // act - assert
        mocMvc.perform(post("/estado")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(estado)))
                .andExpect(status().isOk())
                .andExpect(content().json("{'valor': 2}"));
    }

    @Test
    @Order(2)
    @DisplayName("Deberia actualizar el estado")
    void deberiaActualizarUnEstado() throws Exception{
        // arrange
        Long id = 1L;
        ComandoEstado estado = new ComandoEstadoTestDataBuilder().build();
        // act - assert
        mocMvc.perform(put("/estado/{id}",id)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(estado)))
                .andExpect(status().isOk());
    }



}
