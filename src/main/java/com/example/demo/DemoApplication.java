package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


//启动类加上@ServletComponentScan 过滤器注解，类似权限控制，未登录状态下请求资源接口直接返回登录界面
//启动类里面 @EnableScheduling开启定时任务，自动扫描
//启动类里面使用@EnableAsync注解开启功能，自动扫描

@SpringBootApplication
@ServletComponentScan
@EnableScheduling
@EnableAsync
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
