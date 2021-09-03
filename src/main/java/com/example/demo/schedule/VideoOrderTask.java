package com.example.demo.schedule;


//定时统计订单
//定时任务业务类 加注解 @Component被容器扫描
//定时执行的方法加上注解 @Scheduled(fixedRate=2000) 定期执行一次


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class VideoOrderTask {

    @Scheduled(fixedRate = 200000)
    public void sum(){

        System.out.println(LocalDateTime.now()+"当前"+Math.random());
    }


}
