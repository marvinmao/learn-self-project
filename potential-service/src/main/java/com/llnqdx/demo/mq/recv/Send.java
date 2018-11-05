package com.llnqdx.demo.mq.recv;

import com.example.demo.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * Created by maofujiang on 2018/9/12.
 */
public class Send {

    public static String QUEUE_NAME = "test_queue";

    public static void main(String[] args) throws Exception {

        Connection connection = ConnectionUtil.getConnection();
        //创建一个通道
        Channel channel = connection.createChannel();
        //声明要关注的队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        StringBuilder message = new StringBuilder("Hello Word ");
		for (int i=0;i<50;i++){
			message.append(i);
			channel.basicPublish("", QUEUE_NAME, null, message.toString().getBytes());
			System.out.println("Send ["+message+"]");
			message = new StringBuilder("Hello Word ");
			Thread.sleep(i*10);
		}
        channel.basicPublish("", QUEUE_NAME, null, message.toString().getBytes());
        System.out.println("Send [" + message + "]");
        channel.close();
        connection.close();

    }
}