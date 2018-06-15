package com.activemq.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * JMS消费者2
 *
 * @author guoqiangfeng
 * @since 2018/6/13
 */
@Component
public class Consumer1 {
    @JmsListener(destination = "sample.queue")
    public void receiveQueue(String text) {

        System.out.println("消费者1" +  text);
    }

}
