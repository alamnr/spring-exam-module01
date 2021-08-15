package com.spring.professional.exam.tutorial.module01.question24.activations.spring.boot.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.professional.exam.tutorial.module01.question24.activations.spring.boot.properties.dao.FinancialDataDao;





@SpringBootApplication
public class Runner implements CommandLineRunner{
	
	@Autowired
	private FinancialDataDao financialDataDao;

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(financialDataDao.getClass().getSimpleName());
		
	}

}