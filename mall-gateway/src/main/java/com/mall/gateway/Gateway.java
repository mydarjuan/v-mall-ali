package com.mall.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 刘建波
 * @date 2020-03-01
 */

@SpringBootApplication(scanBasePackages = {"com.mall.*"})
@EnableDiscoveryClient
public class Gateway {
    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }
}
