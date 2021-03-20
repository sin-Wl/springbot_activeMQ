package com.wenlei.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbotMqTopicProducerApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(SpringbotMqTopicProducerApplication1.class, args);
    }

}
