package com.activemq.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * JMS生产者
 *
 * @author guoqiangfeng
 * @since 2018/6/13
 */
@RestController
public class Producer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    @RequestMapping("/sendMsg")
    public void send(String msg) {
//        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
        this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }
}
