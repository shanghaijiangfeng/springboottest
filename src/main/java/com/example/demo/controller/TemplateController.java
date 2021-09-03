package com.example.demo.controller;


import com.example.demo.config.WxConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tpl")
public class TemplateController {
    @Autowired
    private WxConfig wxConfig;

    @GetMapping("freemaker")
    public String index1(ModelMap modelMap) {
        modelMap.addAttribute("setting", wxConfig);
        return "user/fm/index";


    }

    @GetMapping("thymeleaf")
    public String index2(ModelMap modelMap) {
        modelMap.addAttribute("setting", wxConfig);
        return "tl/index";

    }
}
