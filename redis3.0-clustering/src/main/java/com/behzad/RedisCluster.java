package com.behzad;

import redis.clients.jedis.JedisCluster;

import java.io.IOException;

/**
 * Created by Behzad Altaf
 */
public class RedisCluster {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: RedisCluster <key> <value>");
            System.exit(1);
        }
        String key = args[0];
        String value = args[1];
        try (JedisCluster cluster = new JedisCluster(com.behzad.ClusterLayout.getConnectionPoints())) {
            cluster.set(key, value);
            System.out.println(cluster.get(key));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
