package com.czxy.xcdh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author HOEP
 * @data 2019/2/27
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WebSearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSearchApplication.class,args);
    }
}
