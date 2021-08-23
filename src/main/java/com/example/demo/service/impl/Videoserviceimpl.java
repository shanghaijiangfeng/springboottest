package com.example.demo.service.impl;

import com.example.demo.entity.Video;
import com.example.demo.mapper.Videomapper;

import com.example.demo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Videoserviceimpl implements VideoService {
    @Autowired
    private Videomapper videomapper;
    @Override
    public List<Video> listVideo() {

        return videomapper.listVideo();
    }
}
