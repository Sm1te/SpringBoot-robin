package com.robin.demo03;

import com.robin.demo03.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo03Application {
    @Autowired
    HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(Demo03Application.class, args);
    }

}
