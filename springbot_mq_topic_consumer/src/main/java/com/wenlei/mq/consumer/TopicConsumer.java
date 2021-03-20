package com.wenlei.mq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class TopicConsumer {
    @JmsListener(destination = "${mytopic}")// 表明JmsListener监听的destination是什么
    public void receive(TextMessage textMessage) throws JMSException {
        System.out.println("消费者收到消息："+textMessage.getText());
    }
}
