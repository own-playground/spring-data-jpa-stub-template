package com.tally.stub.service;

import com.tally.stub.domain.User;
import com.tally.stub.support.StubServiceSupport;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserServiceTest extends StubServiceSupport {

    @Test
    @DisplayName("유저 아이디로 조회")
    void getUserById() {
        // given & when
        final User user = userService.getUserById(2L);

        // then
        assertThat(user.getName()).isEqualTo("user2");
    }

    @Test
    @DisplayName("유저 이름으로 조회")
    void getUserByName() {
        // given & when
        final User user = userService.getUserByName("user3");

        // then
        assertThat(user.getName()).isEqualTo("user3");
    }

    @Test
    @DisplayName("유저 아이디로 존재 여부 확인")
    void isExistsById() {
        // given & when
        final boolean exists = userService.isExistsById(1L);

        // then
        assertThat(exists).isTrue();
    }



}