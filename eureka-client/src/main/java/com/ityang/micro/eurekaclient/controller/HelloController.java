package com.ityang.micro.eurekaclient.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: yangchangkui
 * @date: 2018-11-19 15:25
 */

@RestController
@RequestMapping("hello")
public class HelloController {

    @Resource
    DiscoveryClient client;

    @GetMapping("/getMessage")
    public String getMessage(){
        String services = "Services: " + client.getAllKnownRegions();
        System.out.println(services);
        return services;
    }


}
