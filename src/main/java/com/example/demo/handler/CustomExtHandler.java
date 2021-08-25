package com.example.demo.handler;


import com.example.demo.utils.JsonData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;


//@RestControllerAdvice标识这个类专门用来处理异常的注解
@RestControllerAdvice
public class CustomExtHandler {
    @ExceptionHandler(value=Exception.class)
    JsonData handleException(Exception e, HttpServletRequest request){

        return JsonData.bulidError("服务端出问题了",-2);
    }


}
