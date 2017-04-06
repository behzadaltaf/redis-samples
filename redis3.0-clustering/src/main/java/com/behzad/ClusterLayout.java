package com.behzad;

import redis.clients.jedis.HostAndPort;

import java.util.HashSet;
import java.util.Set;

import static com.behzad.config.ApplicationConfig.getRedisHosts;

/**
 * Created by Behzad Altaf
 */
public class ClusterLayout {

    public static Set<HostAndPort> getConnectionPoints(){
        Set<HostAndPort> connectionPoints = new HashSet<>();
        String[] redisHosts = getRedisHosts().split(",");
        for(String redisHost: redisHosts){
            String[] hostAndPort = redisHost.split(":");
            connectionPoints.add(new HostAndPort(hostAndPort[0], Integer.valueOf(hostAndPort[1])));
        }
        return connectionPoints;
    }
}
