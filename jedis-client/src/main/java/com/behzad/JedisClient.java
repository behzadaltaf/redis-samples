package com.behzad;

import redis.clients.jedis.Jedis;

/**
 * Created by Behzad Altaf
 */
public class JedisClient {

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Usage: JedisClient <host> <port> <key> <value>");
        }
        String host = args[0];
        Integer port = Integer.valueOf(args[1]);
        String key = args[2];
        String value = args[3];

        Jedis jedis = new Jedis(host, port);

        System.out.println("Inserting into Redis with key: " + key + "and value: " + value);
        jedis.set(key, value);
        System.out.println("Retrieving from Redis with key: " + key);
        System.out.println("Retrieved value: " + jedis.get(key));

    }
}
