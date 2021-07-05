package com.mashirro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//指定要扫描的Mapper类的包的路径
@MapperScan("com.mashirro.**.mapper")
public class TacoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoWebApplication.class, args);
    }

}
