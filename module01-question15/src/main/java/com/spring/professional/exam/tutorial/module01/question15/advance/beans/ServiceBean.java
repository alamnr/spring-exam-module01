package com.spring.professional.exam.tutorial.module01.question15.advance.beans;

import org.springframework.stereotype.Service;

@Service
public class ServiceBean {
	
	public ServiceBean() {
		System.out.println( getClass().getSimpleName()+" :: Constructor");
	}
}
