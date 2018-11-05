package com.llnqdx.demo.mq.routing;


import com.llnqdx.demo.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * Created by maofujiang on 2018/9/12.
 */
public class Send {

    public static String EXCHANGE_NAME = "test_exchange_direct";

    public static void main(String[] args) throws Exception {

        Connection connection = ConnectionUtil.getConnection();
        //创建一个通道
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");

        String message = "id=1001的商品删除了";
//        String message = "id=1001的商品更新了";
//        String message = "id=1001的商品新增了";
        channel.basicPublish(EXCHANGE_NAME, "delete", null, message.getBytes());
        System.out.println("send [" + message + "]");

        channel.close();
        connection.close();
    }
}