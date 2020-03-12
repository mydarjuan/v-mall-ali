package com.mall.web.service;

import org.springframework.context.annotation.Bean;

/**
 * @author 刘建波
 * @date 2020-03-01
 */
public class FeignConfiguration {
    @Bean
    public EchoServiceFallback echoServiceFallback() {
        return new EchoServiceFallback();
    }
}
