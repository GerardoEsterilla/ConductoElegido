package com.ceiba.servicio.controlador;

import com.ceiba.ApplicationMock;
import com.ceiba.servicio.comando.ComandoServicio;
import com.ceiba.servicio.testdatabuilder.ComandoServicioTestDataBuilder;
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
@WebMvcTest(ComandoControladorServicio.class)
@ContextConfiguration(classes= ApplicationMock.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ComandoControladorServicioTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Test
    @Order(1)
    @DisplayName("Deberia crear un servicio")
    void deberiaCrearElServicioDeManeraCorrecta() throws Exception{
        // arrange
        ComandoServicio servicio = new ComandoServicioTestDataBuilder().build();
        // act - assert
        mocMvc.perform(post("/servicio")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(servicio)))
                .andExpect(status().isOk())
                .andExpect(content().json("{'valor': 2}"));
    }

    @Test
    @Order(2)
    @DisplayName("Deberia actualizar un servicio")
    void deberiaActualizarUnServicio() throws Exception{
        // arrange
        Long id = 1L;
        ComandoServicio servicio = new ComandoServicioTestDataBuilder().build();
        // act - assert
        mocMvc.perform(put("/servicio/{id}",id)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(servicio)))
                .andExpect(status().isOk());
    }

    @Test
    @Order(3)
    @DisplayName("Deberia eliminar un servicio")
    void deberiaEliminarUnServicio() throws Exception {
        // arrange
        Long id = 1L;
        // act - assert
        mocMvc.perform(delete("/servicio/{id}",id)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        mocMvc.perform(get("/servicios")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(0)));
    }

}
