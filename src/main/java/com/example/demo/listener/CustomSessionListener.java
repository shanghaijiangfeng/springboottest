package com.example.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
class CustomSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {


        System.out.println("sessionCreated====");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

        System.out.println("sessionDestroyed====");

    }

}
