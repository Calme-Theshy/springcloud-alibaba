package com.qiyong.controller;

import com.qiyong.provider.HelloProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xqy
 * @create: 2021-03-21 22:56
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloProvider helloProvider;

    @GetMapping("/test")
    public String echo(String name) {
        return helloProvider.echo(name);
    }

}
