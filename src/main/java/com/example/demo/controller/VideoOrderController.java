package com.example.demo.controller;


import com.example.demo.utils.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pri/order")
public class VideoOrderController {


    @RequestMapping("save")
    public JsonData saveOrder(){

        return JsonData.bulidSuccess("下单成功");
    }




}