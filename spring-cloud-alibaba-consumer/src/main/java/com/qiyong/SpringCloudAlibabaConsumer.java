package com.qiyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: xqy
 * @create: 2021-03-21 22:55
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudAlibabaConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaConsumer.class);
    }
}
