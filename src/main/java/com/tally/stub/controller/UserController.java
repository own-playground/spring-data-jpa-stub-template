package com.tally.stub.controller;

import com.tally.stub.domain.User;
import com.tally.stub.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable final Long userId) {
        return ResponseEntity.ok().body(userService.getUserById(userId));
    }

    @GetMapping("/users/names/{username}")
    public ResponseEntity<User> getUserByName(@PathVariable final String username) {
        return ResponseEntity.ok().body(userService.getUserByName(username));
    }

    @GetMapping("/users/{userId}/exists")
    public ResponseEntity<Boolean> isExistsById(@PathVariable final Long userId) {
        return ResponseEntity.ok().body(userService.isExistsById(userId));
    }

}
