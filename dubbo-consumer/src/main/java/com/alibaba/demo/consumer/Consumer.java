package com.alibaba.demo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer.xml");
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println("consumer");
		System.out.println(demoService.getPermission(1L));
	}
}
