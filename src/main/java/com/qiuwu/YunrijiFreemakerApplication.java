package com.qiuwu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qiuwu.mapper")
public class YunrijiFreemakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunrijiFreemakerApplication.class, args);
    }

}
