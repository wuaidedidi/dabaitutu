package com.lichen.dabaitutu.common.entity;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

/**
 * @author lichen
 * @version 1.0.0
 * @className DabaituResponse.java
 * @Description TODO
 * @createTime 2022年08月19日 14:26:00
 */
public class DabaituResponse extends HashMap<String,Object> {

    public DabaituResponse code(HttpStatus status){
        put("code",status.value());
        return this;
    }

    public DabaituResponse message(String message){
        put("message",message);
        return this;
    }

    public DabaituResponse data(Object data){
        put("data",data);
        return this;
    }

    public DabaituResponse success(){
        code(HttpStatus.OK);
        return this;
    }
    public DabaituResponse fail(){
        code (HttpStatus.INTERNAL_SERVER_ERROR);
        return this;
    }

    @Override
    public DabaituResponse put(String key, Object value) {
        super.put(key,value);
        return this;
    }

}
