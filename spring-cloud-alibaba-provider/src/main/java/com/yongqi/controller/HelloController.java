package com.yongqi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xqy
 * @create: 2021-03-21 22:17
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String echo(String name) {
        return "Hello Nacos Discovery" + name;
    }
}
