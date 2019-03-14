package com.czxy.xcdh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author HOEP
 * @data 2019/2/27
 */
@SpringBootApplication
@EnableEurekaServer
public class WebEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(WebEurekaServer.class,args);
    }
}
