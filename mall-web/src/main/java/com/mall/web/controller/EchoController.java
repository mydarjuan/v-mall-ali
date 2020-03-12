package com.mall.web.controller;

import com.mall.web.service.DubboEchoService;
import com.mall.web.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘建波
 * @date 2020-03-01
 */

@RestController
@RequestMapping(value = "/echo")
public class EchoController {

    @Autowired
    private EchoService echoService;


    @Autowired
    private DubboEchoService dubboEchoService;

    @GetMapping("/say")
    public String say() {
        return echoService.say();
    }

    @GetMapping("/dubbo-say")
    public String dubboSay() {
        return dubboEchoService.say();
    }

}
