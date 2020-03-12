package com.mall.web.controller;

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

    @GetMapping("/say")
    public String say() {
        return echoService.say();
    }
}
