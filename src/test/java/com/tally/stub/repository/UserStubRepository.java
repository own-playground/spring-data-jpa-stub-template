package com.tally.stub.repository;

import com.tally.stub.domain.User;
import com.tally.stub.domain.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserStubRepository implements UserRepository {

    private long id = 1;
    private final Map<Long, User> database = new HashMap<>();

    public UserStubRepository() {
        database.put(id, new User(id++, "user1"));
        database.put(id, new User(id++, "user2"));
        database.put(id, new User(id++, "user3"));
    }

    @Override
    public User getBy(final Long userId) {
        return database.get(userId);
    }

    @Override
    public User getByName(final String name) {
        return database.values().stream()
                .filter(user -> user.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean existsById(final Long userId) {
        return database.values()
                .stream()
                .anyMatch(user -> user.getId().equals(userId));
    }

}
