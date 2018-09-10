package com.alibaba.dubbo.DemoServiceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Proider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("proider.xml");
		System.out.println(context.getDisplayName() + " : here");
		context.start();
		System.out.println("服务已经启动");
		System.in.read();
	}
}
