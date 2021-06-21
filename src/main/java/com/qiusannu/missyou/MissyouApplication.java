package com.qiusannu.missyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.qiusannu")
public class MissyouApplication {
    public static void main(String[] args) {
        SpringApplication.run(MissyouApplication.class, args);
    }
}
