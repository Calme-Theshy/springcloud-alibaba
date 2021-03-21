package com.yongqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: 启动类
 * @author: xqy
 * @create: 2021-03-21 20:54
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAlibabaNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaNacosApplication.class);
    }
}
