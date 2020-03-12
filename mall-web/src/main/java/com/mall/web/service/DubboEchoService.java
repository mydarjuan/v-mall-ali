package com.mall.web.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import com.mall.interfaces.EchoService;

@Service
public class DubboEchoService {

    @Reference
    private EchoService demoService;

    public String say() {
        return demoService.sayName("Consumer");
    }
}
