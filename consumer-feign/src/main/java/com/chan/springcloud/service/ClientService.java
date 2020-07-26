package com.chan.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: chenjingshan
 * @date: 2020/7/26
 * @version: 1.0
 */
@FeignClient(value = "provider", fallbackFactory = ClientFallbackFactory.class)
public interface ClientService {

    @GetMapping("/hello")
    String hello();

}
