package com.example.movies.study.rabbitmq_study.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 获取mq链接
 */
public class RabbitMqConnection {
    /**
     * 获取rabbitmq 链接
     * @return
     */
    public static Connection getRabbitConnection(){
        //定义一个工厂
        ConnectionFactory factory = new ConnectionFactory();

//        设置主机
        factory.setHost("192.168.92.128");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("admin");
        Connection connection = null;
        try {
            connection = factory.newConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
