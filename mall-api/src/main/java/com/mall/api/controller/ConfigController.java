package com.mall.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘建波
 * @date 2020-02-29
 */

@RestController
@RequestMapping(value = "/config")
@RefreshScope
public class ConfigController {

    @Value("${name}")
    public String config;


    @GetMapping(value = "/name")
    public String getConfig() {
        return config;
    }
}
