package com.wenlei.mq.config;


import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

@Component
@EnableJms// 开启JMS适配的注解
public class ConfigBean {
    @Value("${mytopic}")
    private String myTopic;

    @Bean
    public Topic topic() {
        return new ActiveMQTopic(myTopic);
    }
}