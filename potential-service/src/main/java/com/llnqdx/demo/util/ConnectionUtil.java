package com.llnqdx.demo.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtil {
	public static Connection getConnection() throws Exception {

		// 创建连接工厂
		ConnectionFactory factory = new ConnectionFactory();
		//设置RabbitMQ信息
		factory.setHost("localhost");
		factory.setPort(5672);
		factory.setVirtualHost("/taotao");
		factory.setUsername("taotao");
		factory.setPassword("taotao");

		//创建一个新的连接
		Connection connect = factory.newConnection();
		return connect;
	}
}