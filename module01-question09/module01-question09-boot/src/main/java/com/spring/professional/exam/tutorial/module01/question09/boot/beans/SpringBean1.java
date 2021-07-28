package com.spring.professional.exam.tutorial.module01.question09.boot.beans;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
	
	public void sayHello() {
		System.out.println(" Hello ");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(" @Predestroy " + getClass().getSimpleName());
	}

}
