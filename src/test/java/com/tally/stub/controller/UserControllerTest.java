package com.tally.stub.controller;

import com.tally.stub.support.StubControllerSupport;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class UserControllerTest extends StubControllerSupport {

    @Test
    void getUserById() throws Exception {
        mockMvc.perform(get("/api/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("user1"));
    }

    @Test
    void getUserByName() throws Exception {
        mockMvc.perform(get("/api/users/names/user2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("user2"));
    }

    @Test
    void isExistsById() throws Exception {
        mockMvc.perform(get("/api/users/1/exists"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").value(true));
    }

}