package com.example.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

@Service
public class RedisService {
    @Autowired
    private JedisPool pool;

    public int set(String key,Object T){
//        pool.get
        return -1;
    }

}
