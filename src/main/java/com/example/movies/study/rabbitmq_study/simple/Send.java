package com.example.movies.study.rabbitmq_study.simple;

import com.example.movies.study.rabbitmq_study.utils.RabbitMqConnection;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import lombok.extern.log4j.Log4j;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {
    private final static String QUEUE_NAME = "test_simple_queue";
//    private
    public static void main(String[] args) throws IOException, TimeoutException {
        //获取链接
        Connection connection = RabbitMqConnection.getRabbitConnection();
        //获取通道
        Channel channel = connection.createChannel();
        //创建队列声明
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        String meg = "hello simple";
        channel.basicPublish("",QUEUE_NAME,null,meg.getBytes());
        System.out.println("send message"+meg);
        channel.close();
        connection.close();
    }
}
