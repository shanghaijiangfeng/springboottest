package com.example.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
public class VideoTest {
    @Before
    public void testOne(){
        System.out.println("这是测试before");
    }
    @Test
    public void testTwo(){
        System.out.println("这是测试test");
    }
    @After
    public void testThree(){
        System.out.println("这是测试three");
    }

}


