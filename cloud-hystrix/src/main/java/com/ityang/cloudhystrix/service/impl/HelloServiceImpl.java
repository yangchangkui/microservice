package com.ityang.cloudhystrix.service.impl;

import com.ityang.cloudhystrix.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author: yangchangkui
 * @date: 2018-11-29 17:07
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String get(long id) {
        return null;
    }
}
