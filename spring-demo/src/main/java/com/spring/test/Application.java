package com.spring.test;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext bf = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		ServiceA bean = (ServiceA) bf.getBean("serviceA");
		bean.say();

		bean.getServiceB().say();
	}

}
