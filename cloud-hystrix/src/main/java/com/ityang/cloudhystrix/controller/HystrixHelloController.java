package com.ityang.cloudhystrix.controller;

import com.ityang.cloudhystrix.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: yangchangkui
 * @date: 2018-11-29 16:56
 */
@RequestMapping("/hystrixHello")
@Controller
public class HystrixHelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod="getFallback")    // 如果当前调用的get()方法出现了错误，则执行fallback
    public String get(@PathVariable("id") long id) {
        String message = helloService.get(id) ;    // 接收数据库的查询结果
        if (message == null) {    // 数据不存在，假设让它抛出个错误
            throw new RuntimeException("消息不存在！") ;
        }
        return message ;
    }
    public String getFallback(@PathVariable("id") long id) {    // 此时方法的参数 与get()一致
        return "message"+id ;
    }
}
