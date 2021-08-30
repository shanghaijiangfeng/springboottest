package com.example.demo.controller;


import com.example.demo.config.WxConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("freemaker")
public class FreemakerController {
    @Autowired
    private WxConfig wxConfig;

    @RequestMapping("test")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("setting",wxConfig);
        return "user/fm/index";


    }
}
