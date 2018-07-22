package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableScheduling
@SpringBootApplication
//@RequestMapping("com.course")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
