package com.spring.test;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ServiceA {

	@Resource
	private ServiceB serviceB;

	public ServiceB getServiceB() {
		return serviceB;
	}

	public void setServiceB(ServiceB serviceB) {
		this.serviceB = serviceB;
	}

	public void say(){
		System.out.println("A");
	}
}
