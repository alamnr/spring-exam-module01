package com.spring.professional.exam.tutorial.module01.question22;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.professional.exam.tutorial.module01.question22.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question22.beans.SpringBean2;
import com.spring.professional.exam.tutorial.module01.question22.beans.SpringBean3;

@Configuration
public class ApplicationConfig {

	@Bean
	//@Scope("prototype")
	public SpringBean1 springBean1() {
		return new SpringBean1();
	}
	
	@Bean(name = "2ndSpringBean")
	public SpringBean2 springBean2() {
		return new SpringBean2();
	}
	
	@Bean(name = {"3rdSpringBean","thirdSpringBean"})
	public SpringBean3 springBean3() {
		return new SpringBean3();
	}
}
