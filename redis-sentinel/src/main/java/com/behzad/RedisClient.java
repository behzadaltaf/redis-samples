package com.behzad;

import com.behzad.cache.Cache;
import com.behzad.cache.RedisCache;

import java.util.Date;

/**
 * Created by Behzad Altaf
 */
public class RedisClient {

    public static void main(String[] args) {
        Cache<String, String> redisCache = new RedisCache();
        redisCache.put("testKey", String.valueOf(new Date()));
        System.out.println("testKey value is : " + redisCache.get("testKey"));
    }
}
