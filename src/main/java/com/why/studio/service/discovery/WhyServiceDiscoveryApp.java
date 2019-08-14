package com.why.studio.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WhyServiceDiscoveryApp {

    public static void main(String[] args) {
        SpringApplication.run(WhyServiceDiscoveryApp.class, args);
    }

}
