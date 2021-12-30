package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
    private int id;
    private String username;
    private String password;

    public User(){}
    public User(int id,String username,String password){
        this.id=id;
        this.username=username;
        this.password=password;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
}
