package com.example.demo.task;


import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;


//定义异步任务类并使用@Component标记组件被容器扫描,异步方法加上@Async

@Component
@Async
public class AsyncTask {

    public void task1(){
        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task1");
    }
    public void task2(){
        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task2");
    }

    public void task3(){
        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task3");
    }
    public Future<String> task4(){
        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task4");
        return new AsyncResult<String>("task4");
    }
    public Future<String> task5(){
        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task5");
        return new AsyncResult<String>("task5");
    }




}
