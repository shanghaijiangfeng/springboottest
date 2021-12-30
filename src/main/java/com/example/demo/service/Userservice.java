package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface Userservice {
    String login(String username, String password);
    List<User> listUser();
}
