package com.abidi.springcloud;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest // doesnt pull up the hole application, just component that anotate controller controller advice etc
    // it doesnt start spring servlet container, it mockes one (mochMVC)
class HomeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("it should Display HomePage")
    void shouldDisplayHomePage() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk());
    }


}