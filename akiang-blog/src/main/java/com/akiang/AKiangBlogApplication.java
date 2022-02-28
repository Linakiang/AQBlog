package com.akiang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: ziluolan
 * @Date: 2022/2/28 10:31
 */

@SpringBootApplication
@MapperScan("com.akiang.mapper")
public class AKiangBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(AKiangBlogApplication.class);
    }
}
