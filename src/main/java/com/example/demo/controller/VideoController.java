package com.example.demo.controller;

import com.example.demo.entity.Video;
import com.example.demo.service.VideoService;
import com.example.demo.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* demo1，视频控制器
* @Restcontroller，返回的是json数据
* @RequestMapping是请求路径
* */
@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @GetMapping("list")
    public Object list(){
        List<Video> list= videoService.listVideo();

        return JsonData.bulidSuccess(list);
    }
}
