package com.llnqdx.demo.mq.ps;


import com.llnqdx.demo.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * Created by maofujiang on 2018/9/12.
 */
public class Send {

    public static String EXCHANGE_NAME = "test_exchange_fanout";

    public static void main(String[] args) throws Exception {

        Connection connection = ConnectionUtil.getConnection();
        //创建一个通道
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

        String message = "id=1001";
        channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
        System.out.println("send ["+message+"]");

        channel.close();
        connection.close();
    }
}