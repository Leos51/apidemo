package training.afpa.cda24060.apidemo.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import training.afpa.cda24060.apidemo.service.PersonService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PersonController.class)
class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private PersonService personService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void getPersonsTest() throws Exception {
        when(personService.getPersons()).thenReturn(List.of());
        mockMvc.perform(get("/persons")).andExpect(status().isOk());
    }

    @Test
    void createPerson() {
    }

    @Test
    void getAllPersons() {
    }

    @Test
    void getPersonById() {
    }

    @Test
    void updatePerson() {
    }

    @Test
    void deletePerson() {
    }
}