package com.spring.professional.exam.tutorial.module01.question06.boot.cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.professional.exam.tutorial.module01.question06.boot.cli.beans.SpringBean1;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

	@Autowired
	private SpringBean1 springBean1;
	
	public static void main(String...  args) {
		SpringApplication.run(SpringBootConsoleApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(springBean1.sayHello());
		
	}

}
