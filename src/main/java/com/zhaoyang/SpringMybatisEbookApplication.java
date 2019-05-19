package com.zhaoyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class SpringMybatisEbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisEbookApplication.class, args);
    }

}
