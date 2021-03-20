package com.wenlei.mq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

@Component
public class TopicProducer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Topic topic;

    /**
     * 每间隔3秒钟执行一次
     */
    @Scheduled(fixedDelay = 3000)
    public void produceMessageScheduled() {
        jmsMessagingTemplate.convertAndSend(topic, "SpringBoot整合ActiveMQ的Scheduled()方法");
    }
}
