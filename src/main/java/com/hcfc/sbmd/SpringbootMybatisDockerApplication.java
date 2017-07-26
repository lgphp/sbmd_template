package com.hcfc.sbmd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.hcfc.sbmd"})
public class SpringbootMybatisDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDockerApplication.class, args);
    }
}
