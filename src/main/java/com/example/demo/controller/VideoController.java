package com.example.demo.controller;

import com.example.demo.entity.Video;
import com.example.demo.service.VideoService;
import com.example.demo.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* demo1，视频控制器
* @Restcontroller，返回的是json数据
* @RequestMapping是请求路径
* @Autowired注入，可以不用实例化对象即可直接调用
* */
@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @GetMapping("list")
    public JsonData list(){
        List<Video> list= videoService.listVideo();


        return JsonData.bulidSuccess(list);
    }
    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video){

        System.out.println(video.toString());
        return JsonData.bulidSuccess(video);
    }
}
