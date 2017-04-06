package com.behzad.cache;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;
import redis.clients.util.Pool;

import java.util.HashSet;
import java.util.Set;

import static com.behzad.config.ApplicationConfig.*;

/**
 * Created by Behzad Altaf
 */
public class JedisSentinal {

    private static Set<String> sentinels = new HashSet<>();

    private JedisSentinal() {
    }

    static Pool<Jedis> getJedisSentinelPool() {
        sentinels.add(getSentinal1());
        sentinels.add(getSentinal2());
        sentinels.add(getSentinal3());
        return new JedisSentinelPool(getMasterName(), sentinels);
    }
}
