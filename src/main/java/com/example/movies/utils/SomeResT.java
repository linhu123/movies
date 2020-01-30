package com.example.movies.utils;

public class SomeResT extends ResT {
    public static ResT getSuccessNeedData(Object data){
        return new ResT(200,"success",data);
    }
}
