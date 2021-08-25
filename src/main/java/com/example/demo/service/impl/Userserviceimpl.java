package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.Usermapper;
import com.example.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class Userserviceimpl implements Userservice {

    public static Map<String, User> sessionMap = new HashMap<>();
    @Autowired
    private Usermapper userMapper;
    @Override
    public String login(String username, String pwd) {
        User user=userMapper.login(username,pwd);
        if (user==null){
            return null;
        }else {
           String token=UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token,user);
            return token;
        }
    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
