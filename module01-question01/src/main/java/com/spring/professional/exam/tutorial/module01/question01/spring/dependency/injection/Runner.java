package com.spring.professional.exam.tutorial.module01.question01.spring.dependency.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
	
	public static void main(String ...args) {
		
		AnnotationConfigApplicationContext context  = getSpringContext("xls-reports");
		
		EmployeeSalariesReportService employeeSalariesReportService = context.getBean(EmployeeSalariesReportService.class);
		employeeSalariesReportService.generateReport();
		
		context.close();
		
	}
	
	private static AnnotationConfigApplicationContext getSpringContext(String profile) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles(profile);
		context.register(Configuration.class);
		context.refresh();
		return context;
	}

}
