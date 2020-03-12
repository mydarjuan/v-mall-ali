package com.mall.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 刘建波
 * @date 2020-03-01
 */

@RestController
@RequestMapping("/echo")
public class EchoController {


    @GetMapping("/say")
    public String say() {
        return "hi api" + (new Date()).toString();
    }
}
