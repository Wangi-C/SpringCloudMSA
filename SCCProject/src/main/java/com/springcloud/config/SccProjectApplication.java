package com.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //config server로써 실행
public class SccProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SccProjectApplication.class, args);
    }

}
