package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Laptop laptop = (Laptop) context.getBean("l1");
		System.out.println(laptop);

		// registering shutdown hook
		context.registerShutdownHook();
	}
}
