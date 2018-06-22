package com.sephiroth.wzcbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.sephiroth.wzcbase.dao")
public class WzcbaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WzcbaseApplication.class, args);
    }
}
