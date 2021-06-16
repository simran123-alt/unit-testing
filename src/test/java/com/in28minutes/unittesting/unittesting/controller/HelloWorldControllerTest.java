package com.in28minutes.unittesting.unittesting.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)   -> when use JUnit4
@WebMvcTest(value = HelloWorldController.class)
class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloWorld_basic() throws Exception{
        //call "/hello-world" GET application/json
        RequestBuilder request= MockMvcRequestBuilders.get("/hello-world").accept(MediaType.APPLICATION_JSON);


        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                // .andExpect(content().json("Hello World"))
                .andExpect(content().string("Hello World"))
                .andReturn();

        //and then we want to verify response contains "Hello World"
        //assertEquals("Hello World",result.getResponse().toString()); ->this will fail so use getContentAsString()
       // assertEquals("Hello World",result.getResponse().getContentAsString());
    }

}