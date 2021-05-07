package com.spring.test;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ServiceB {

	@Resource
	private ServiceA serviceA;

	public ServiceA getServiceA() {
		return serviceA;
	}

	public void setServiceA(ServiceA serviceA) {
		this.serviceA = serviceA;
	}

	public void say(){
		System.out.println("B");
	}
}
