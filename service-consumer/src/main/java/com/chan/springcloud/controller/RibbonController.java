package com.chan.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: chenjingshan
 * @date: 2020/7/26
 * @version: 1.0
 */
@RestController
public class RibbonController {
    private final static String PREFIX = "http://provider/"; //服务名

    @Autowired
    private RestTemplate template;

    @GetMapping("/hello")
    public String hello(){
        return template.getForObject(PREFIX+"hello",String.class, (Object) null);
    }

}
