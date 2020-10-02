package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages= "com.atguigu.springboot.mapper")
@SpringBootApplication
public class springbootself {
    public static void main(String[] args) {
        SpringApplication.run(springbootself.class,args);
    }

}
