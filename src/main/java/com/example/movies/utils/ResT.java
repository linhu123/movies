package com.example.movies.utils;

import com.alibaba.fastjson.annotation.JSONField;

public class ResT {
    private int code;
    private String message;
    private Object data;
    public static ResT getSuccessNeedData(Object data){
        return new ResT(200,"success",data);
    }
    public ResT() {
    }

    public ResT(int code, String message, Object data){
        this.code=code;
        this.message=message;
        this.data=data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
