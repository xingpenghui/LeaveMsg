package com.qfedu.leavemsg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qfedu.leavemsg.mapper")//扫描对应的dao接口文件
public class LeavemsgApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeavemsgApplication.class, args);
    }
}
