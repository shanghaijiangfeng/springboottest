package com.example.demo.utils;

public class JsonData {
    private int code;
    private Object data;
    private String msg;
    public JsonData(){}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonData(int code, Object data){
        this.code=code;
        this.data=data;
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public static JsonData bulidSuccess(Object data){
        return new JsonData(200,data);
    }
    public static JsonData bulidError(String msg){
        return new JsonData(-1,"",msg);
    }
    public static JsonData bulidError(String msg, int code){
        return new JsonData(code,"",msg);
    }

}
