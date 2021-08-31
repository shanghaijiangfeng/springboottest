package com.example.demo.intercepter;

import com.example.demo.entity.User;
import com.example.demo.service.impl.Userserviceimpl;
import com.example.demo.utils.JsonData;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

class LoginIntercepter implements HandlerInterceptor {


    private static final ObjectMapper objectMapper = new ObjectMapper();



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("LoginIntercepter preHandle =====");



        String token = request.getHeader("token");
        if(StringUtils.isEmpty(token)){
            token = request.getParameter("token");
        }


        if(!StringUtils.isEmpty(token)){

            //判断token是否合法
            User user = Userserviceimpl.sessionMap.get(token);

            if(user!=null){

                return true;
            }else {

                JsonData jsonData = JsonData.bulidError("登录失败，token无效",-2);
                String jsonStr = objectMapper.writeValueAsString(jsonData);
                renderJson(response,jsonStr);
                return false;

            }

        }else {

            JsonData jsonData =  JsonData.bulidError("未登录",-3);
            String jsonStr = objectMapper.writeValueAsString(jsonData);
            renderJson(response,jsonStr);
            return false;
        }

        //return HandlerInterceptor.super.preHandle(request,response,handler);
    }



    private void renderJson(HttpServletResponse response,String json){

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");


        try(PrintWriter writer = response.getWriter()){
            writer.print(json);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("LoginIntercepter postHandle =====");

        HandlerInterceptor.super.postHandle(request,response,handler,modelAndView);

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println("LoginIntercepter afterCompletion =====");

        HandlerInterceptor.super.afterCompletion(request,response,handler,ex);
    }
}
