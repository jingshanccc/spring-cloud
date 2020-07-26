package com.chan.springcloud.service;

import feign.hystrix.FallbackFactory;

/**
 * @Author: chenjingshan
 * @date: 2020/7/26
 * @version: 1.0
 */
public class ClientFallbackFactory implements ClientService {

    @Override
    public String hello() {
        return "feign fallback hello";
    }
}
