package com.mall.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 刘建波
 * @date 2020-02-28
 */

@SpringBootApplication(scanBasePackages = {"com.mall.web.*"})
@EnableDiscoveryClient
@EnableFeignClients
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}
