package com.babeltime.tryspring;

import com.babeltime.tryspring.web.HelloController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(classes=TryspringApplication.class)


public class HelloTest {

    private MockMvc mockMvc;

    @BeforeEach
    public  void setUp() throws Exception{
        mockMvc= MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void getHello() throws  Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=test").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.content().
                string(Matchers.containsString("test")));/*andDo(print())*/;
    }
}
