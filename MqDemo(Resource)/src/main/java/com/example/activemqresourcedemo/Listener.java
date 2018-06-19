package com.example.activemqresourcedemo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * jms消息监听模式
 *
 * @author guoqiangfeng
 * @since 2018/6/19
 */
public class Listener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("收到的消息："+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
