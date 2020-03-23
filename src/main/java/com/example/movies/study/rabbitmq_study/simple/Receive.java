package com.example.movies.study.rabbitmq_study.simple;

import com.example.movies.study.rabbitmq_study.utils.RabbitMqConnection;
import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * 消费者获取消息
 */
public class Receive {
    private final static String QUEUE_NAME = "test_simple_queue";

    public static void main(String[] args) throws IOException {
        Connection connection = RabbitMqConnection.getRabbitConnection();
        Channel channel = connection.createChannel();
        //队列声明
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body);
                System.out.println("msg is "+msg);
            }
        };
        //监听队列
        channel.basicConsume(QUEUE_NAME,true,defaultConsumer);
    }
}
