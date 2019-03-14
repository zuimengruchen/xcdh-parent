package com.czxy.xcdh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author HOEP
 * @data 2019/2/27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebServiceApplication.class,args);
    }
}
