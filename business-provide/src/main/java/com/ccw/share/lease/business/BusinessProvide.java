package com.ccw.share.lease.business;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class BusinessProvide {

    public static void main(String[] args) {
        SpringApplication.run(BusinessProvide.class, args);
    }

}
