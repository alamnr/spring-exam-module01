package com.spring.professional.exam.tutorial.module01.question06.non.web.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("%s :: postProcessBeforeInitialization  %s %s ", getClass().getSimpleName()
				,bean.getClass().getSimpleName(), beanName));
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("%s :: postProcessAfterInitialization  %s %s ", getClass().getSimpleName()
				,bean.getClass().getSimpleName(), beanName));
		return null;
	}
	
	

}
