package com.javatpoint.service.container;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.javatpoint.service.CustomerService;
import com.util.generic.configuration.AppConfig;

public class ServiceContainer {
	private static AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	public static CustomerService customerService;
	static {
		customerService = context.getBean(CustomerService.class);
	}
}
