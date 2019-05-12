package com.zhaoyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhaoyang.mapper")

public class SpringMybatisEbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisEbookApplication.class, args);
    }

}
