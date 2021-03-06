package com.spring.professional.exam.tutorial.module01.question20.component.scanning.context.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
	
	private final SpringBean2 springBean2;
	private final SpringBean3 springBean3;
	
	public SpringBean1(SpringBean2 springBean2, SpringBean3 springBean3) {
		this.springBean2 = springBean2;
		this.springBean3 = springBean3;
	}
	
	public void printDependencies() {
		System.out.println("Listing beans of dependencies : " + getClass().getSimpleName()+"\n"+
				springBean2.getClass().getSimpleName()+"\n"+
				springBean3.getClass().getSimpleName());
		
	}

}
