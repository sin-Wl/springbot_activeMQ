package com.wenlei.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootMqProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMqProducerApplication.class, args);
    }

}
