package com.spring.professional.exam.tutorial.module01.question19.proxy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		context.registerShutdownHook();
		
		System.out.println(context.getBean(SpringBean.class).toString());
		System.out.println(context.getBean(SpringBean.class).toString());
	}
}
