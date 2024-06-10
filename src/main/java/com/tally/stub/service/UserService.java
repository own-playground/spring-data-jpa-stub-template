package com.tally.stub.service;

import com.tally.stub.domain.User;
import com.tally.stub.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUserById(final Long userId) {
        return userRepository.getBy(userId);
    }

    public User getUserByName(final String name) {
        return userRepository.getByName(name);
    }

    public boolean isExistsById(final Long userId) {
        return userRepository.existsById(userId);
    }

}
