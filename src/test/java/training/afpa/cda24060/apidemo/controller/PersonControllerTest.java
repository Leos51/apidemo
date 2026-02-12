package training.afpa.cda24060.apidemo.controller;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import training.afpa.cda24060.apidemo.service.PersonService;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Epic("Person Management")
@Feature("Person API")
@WebMvcTest(PersonController.class)
class PersonControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private PersonService personService;

    @Test
    public void getPersonsTest() throws Exception {

        // défnit le comportement du Mock
        when(personService.getPersons()).thenReturn(List.of());
        // test du controlleur
        mockMvc.perform(get("/persons")).andExpect(status().isOk());
    }
}