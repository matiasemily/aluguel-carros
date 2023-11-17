package br.com.carrent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class StatusControllerTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testStatusGet() throws Exception{
        MvcResult resultado = mockMvc.perform(MockMvcRequestBuilders.get("/status")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        String textoResposta = resultado.getResponse().getContentAsString();
        assert ("Server is on line!".equals(textoResposta));
    }

    @Test
    public void testStatusPost() throws Exception{
        String nome = "Emily";
        MvcResult resultado = mockMvc.perform(MockMvcRequestBuilders.post("/status").content(nome)).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        String textoResposta = resultado.getResponse().getContentAsString();
        assert (nome.equals(textoResposta));
    }
}
