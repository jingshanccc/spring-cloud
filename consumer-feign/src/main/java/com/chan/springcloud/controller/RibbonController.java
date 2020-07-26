package com.chan.springcloud.controller;

import com.chan.springcloud.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenjingshan
 * @date: 2020/7/26
 * @version: 1.0
 */
@RestController
public class RibbonController {

    @Autowired
    private ClientService service;

    @GetMapping("/hello")
    public String hello(){
        return service.hello();
    }

}
