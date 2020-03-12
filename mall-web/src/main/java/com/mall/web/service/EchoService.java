package com.mall.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 刘建波
 * @date 2020-03-01
 */
@FeignClient(name = "mall-api", fallback = EchoServiceFallback.class, configuration = FeignConfiguration.class)
public interface EchoService {
    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);

    @GetMapping("/echo/say")
    String say();
}
