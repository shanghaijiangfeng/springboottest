package com.example.demo.handler;


import com.example.demo.utils.JsonData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


//@RestControllerAdvice标识这个类专门用来处理异常的注解，返回的是json
//@RestControllerAdvice
//@ControllerAdvice，返回H5页面异常处理信息
@ControllerAdvice
public class CustomExtHandler {


//  返回json异常处理
//    @ExceptionHandler(value=Exception.class)
//    JsonData handleException(Exception e, HttpServletRequest request){
//
//        return JsonData.bulidError("服务端出问题了",-2);
//    }
    @ExceptionHandler(value = Exception.class)
    Object handlerException(Exception e,HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("error.html");
        modelAndView.addObject("msg",e.getMessage());
        return modelAndView;


    }



}
