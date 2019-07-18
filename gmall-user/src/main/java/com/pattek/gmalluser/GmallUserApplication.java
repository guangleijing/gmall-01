package com.pattek.gmalluser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pattek.gmalluser.mapper")
//使用mapper公共接口的扫描器
//@tk.mybatis.spring.annotation.MapperScan("com.pattek.gmalluser.mapper")
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
