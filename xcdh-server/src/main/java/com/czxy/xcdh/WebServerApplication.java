package com.czxy.xcdh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author HOEP
 * @data 2019/3/5
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebServerApplication.class,args);
    }
}
