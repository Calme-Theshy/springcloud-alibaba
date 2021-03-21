package com.qiyong.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: xqy
 * @create: 2021-03-21 23:02
 **/
@FeignClient(value = "spring-cloud-alibaba-provider")
public interface HelloProvider {

    @GetMapping("/hello")
    String echo(@RequestParam("name") String name);
}
