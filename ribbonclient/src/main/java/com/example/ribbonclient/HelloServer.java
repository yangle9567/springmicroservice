package com.example.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServer {

    @Autowired
    RestTemplate restTemplate;

    //这里实现负载均衡
    public String hiService(String name) {
        // 192.168.1.102:microservice-hi:1001 , 192.168.1.102:microservice-hi:1002 , 192.168.1.102:microservice-hi:2000
        String forObject = restTemplate.getForObject("http://microservice-hi/hi?name=" + name, String.class);
        return forObject;
    }
}
