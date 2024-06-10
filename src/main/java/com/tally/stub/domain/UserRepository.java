package com.tally.stub.domain;

public interface UserRepository {

    User getBy(final Long userId);
    User getByName(final String name);
    boolean existsById(final Long userId);

}
