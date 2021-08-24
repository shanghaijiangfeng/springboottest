package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.example.demo.entity.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class Usermapper {

    private static Map<String, User> userMap=new HashMap<>();
    static {
        userMap.put("姜峰",new User(1,"姜峰","123456"));
        userMap.put("jack",new User(2,"jack","123456"));
        userMap.put("harrsion",new User(3,"harrsion","123456"));
    }

    public User login(String username,String pwd){
        User user = userMap.get(username);
        if(user==null){
            return null;
        }
        if (user.getPwd().equals(pwd)){
            return user;
        }
        return null;
    }

    public List<User> listUser(){

        List<User> list = new ArrayList<>();
        list.addAll(userMap.values());
        return list;
    }




}
