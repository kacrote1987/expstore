package com.expstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//多数据源时用exclude去除默认配置
@SpringBootApplication
public class ExpStorerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExpStorerApplication.class, args);
    }
}
