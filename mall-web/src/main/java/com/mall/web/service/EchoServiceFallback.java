package com.mall.web.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 刘建波
 * @date 2020-03-01
 */
class EchoServiceFallback implements EchoService {
    @Override
    public String echo(@PathVariable("str") String str) {
        return "echo fallback";
    }

    @Override
    public String say() {
        return "say fallback";
    }
}
