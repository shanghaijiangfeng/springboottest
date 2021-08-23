package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.Userservice;
import com.example.demo.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/pub/user")
public class Usercontroller {
    @Autowired
    public Userservice userService;


    @PostMapping("login")
    public JsonData login(@RequestBody User user){
        System.out.println("user="+user.toString());
        String token=userService.login(user.getUsername(),user.getPwd());
        return token !=null?JsonData.bulidSuccess(token):JsonData.bulidError("账号密码错误");


    }
}
