package com.tally.stub.support;

import com.tally.stub.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest({
        UserController.class
})
@Import(StubConfig.class)
public class StubControllerSupport {

    @Autowired
    protected MockMvc mockMvc;

}
