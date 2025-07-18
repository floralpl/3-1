package com.example.chatroom.service;

import com.example.chatroom.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final Map<String, User> userDatabase = new HashMap<>();
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(String username, String password) {
        if (userDatabase.containsKey(username)) {
            throw new RuntimeException("User already exists");
        }
        User user = new User(username, passwordEncoder.encode(password));
        userDatabase.put(username, user);
        return user;
    }

    public User authenticateUser(String username, String password) {
        User user = userDatabase.get(username);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return user;
        }
        throw new RuntimeException("Invalid username or password");
    }
}