package com.activemq.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * JMS主题消费者1
 *
 * @author guoqiangfeng
 * @since 2018/6/13
 */
@Component
public class Consumer2 {
    @JmsListener(destination = "taskNodeLog")
    public void receiveQueue(String text) {

        System.out.println("主题消费者1" +  text);
    }

}
