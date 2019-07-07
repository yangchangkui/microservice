package com.ityang.micro.eurekaserver.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author: yangchangkui
 * @date: 2018-11-19 15:25
 */

@RestController
public class HelloController {

    @Resource
    DiscoveryClient client;

    @RequestMapping("getAllKnownRegions")
    public Set<String> getMessage(){
        return client.getAllKnownRegions();
    }


}
