package com.example.demo.mapper;

import com.example.demo.entity.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Repository这个注解让mapper实例化，帮你new了一个这个类的对象
@Repository
public class Videomapper {

    private static Map<Integer, Video> videoMap=new HashMap<>();
    static {
        videoMap.put(1,new Video(1,"测试001"));
        videoMap.put(2,new Video(2,"测试002"));
        videoMap.put(3,new Video(3,"测试003"));
        videoMap.put(4,new Video(4,"测试004"));
        videoMap.put(5,new Video(5,"测试005"));

    }
    public List<Video> listVideo(){
        //实例化list对象，泛型规定list是video对象
        List<Video> list =new ArrayList<>();
        //把videomap的数据都取出添加到list对象中
        list.addAll(videoMap.values());
        //返回这个list对象
        return list;
    }
}
