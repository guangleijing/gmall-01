package com.pattek.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pattek")
@SpringBootApplication
public class GmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserServiceApplication.class, args);
    }

}
