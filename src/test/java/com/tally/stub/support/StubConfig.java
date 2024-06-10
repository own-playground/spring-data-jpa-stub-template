package com.tally.stub.support;

import com.tally.stub.domain.UserRepository;
import com.tally.stub.repository.UserStubRepository;
import com.tally.stub.service.UserService;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class StubConfig {

    @Bean
    @Primary
    public UserService userService() {
        return new UserService(userRepository());
    }

    @Bean
    @Primary
    public UserRepository userRepository() {
        return new UserStubRepository();
    }

}
