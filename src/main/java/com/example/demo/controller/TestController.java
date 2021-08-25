package com.example.demo.controller;


import com.example.demo.config.WxConfig;
import com.example.demo.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/test")
@PropertySource("classpath:pay.properties")
public class TestController {
    @Value("${wxpay.appid}")
    private String payAppid;
    @Value("${wxpay.sercret}")
    private String paySecret;
    @Autowired
    private WxConfig wxConfig;

    @GetMapping("list")
    public JsonData testext(){
        int i=1/0;
        return JsonData.bulidSuccess("");
    }

    @GetMapping("get_config")
    public JsonData testConfig(){

//        Map<String,String> map=new HashMap<>();
//
//        map.put("appid",payAppid);
//        map.put("secret",paySecret);
//        return JsonData.bulidSuccess(map);

          Map<String,String> map=new HashMap();
          map.put("payappid",wxConfig.getPayAppid());
          map.put("mechid",wxConfig.getPayMechId());
          map.put("paysecret",wxConfig.getPaySecret());
          return JsonData.bulidSuccess(map);

    }
}
