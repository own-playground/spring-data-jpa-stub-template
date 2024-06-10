package com.tally.stub.repository;

import com.tally.stub.domain.User;
import com.tally.stub.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserFinder implements UserRepository {

    private final UserJpaRepository userRepository;

    @Override
    public User getBy(final Long userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new IllegalArgumentException("User not found"));
    }

    @Override
    public User getByName(final String name) {
        return userRepository.findByName(name).orElseThrow(
                () -> new IllegalArgumentException("User not found"));
    }

    @Override
    public boolean existsById(final Long userId) {
        return userRepository.existsById(userId);
    }

}
