package com.behzad.cache;

import redis.clients.jedis.Jedis;

import static com.behzad.config.ApplicationConfig.getAuth;

/**
 * Created by Behzad Altaf
 */
public class RedisCache implements Cache<String, String> {

    private static Jedis jedis = JedisSentinal.getJedisSentinelPool().getResource();

    public void put(String key, String value) {
        jedis.auth(getAuth());
        jedis.set(key, value);
    }

    public String get(String key) {
        jedis.auth(getAuth());
        return jedis.get(key);
    }
}
