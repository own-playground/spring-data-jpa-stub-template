package com.tally.stub.support;

import com.tally.stub.repository.UserStubRepository;
import com.tally.stub.service.UserService;

public class StubServiceSupport {

    protected UserService userService;

    public StubServiceSupport() {
        final UserStubRepository stubRepository = new UserStubRepository();
        this.userService = new UserService(stubRepository);
    }

}
