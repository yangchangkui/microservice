package com.ityang.micro.eurekaserver.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;

import javax.annotation.Resource;

/**
 * @author: yangchangkui
 * @date: 2018-11-19 15:25
 */
public class HelloController {

    @Resource
    DiscoveryClient client;

    public String getMessage(){
        String services = "Services: " + client.getAllKnownRegions();
        System.out.println(services);
        return services;
    }


}
