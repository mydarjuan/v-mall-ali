package com.mall.api;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 刘建波
 * @date 2020-02-28
 */

@SpringBootApplication(scanBasePackages = {"com.mall.*"})
@MapperScan(basePackages = {"com.mall.dao.*"})
@EnableDubbo(scanBasePackages = "com.mall.service")
@EnableDiscoveryClient
@EnableFeignClients
public class MallApp {
    public static void main(String[] args) {
        SpringApplication.run(MallApp.class, args);
    }
}
