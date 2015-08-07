package com.BeanLifecycle_Example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		BeanLifecycle objA = (BeanLifecycle) context.getBean("idbean");
		objA.getMessage();
		context.registerShutdownHook();
	}

}
