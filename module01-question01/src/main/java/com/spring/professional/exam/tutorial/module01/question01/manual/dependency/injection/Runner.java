package com.spring.professional.exam.tutorial.module01.question01.manual.dependency.injection;

import com.spring.professional.exam.tutorial.module01.question01.commons.bls.EmployeeSalaryCalculator;
import com.spring.professional.exam.tutorial.module01.question01.commons.dao.EmployeeDao;
import com.spring.professional.exam.tutorial.module01.question01.commons.report.PdfSalaryReport;
import com.spring.professional.exam.tutorial.module01.question01.commons.report.XlsSalaryReport;
import com.spring.professional.exam.tutorial.module01.question01.manual.dependency.injection.EmployeeSalariesReportServiceTest;

public class Runner {
	
	 public static void main(String ...args) {
		 
		 com.spring.professional.exam.tutorial.module01.question01.manual.dependency.injection.EmployeeSalariesReportService emplSalariesReportService 
		 		= new   com.spring.professional.exam.tutorial.module01.question01.manual.dependency.injection.EmployeeSalariesReportService( 
		    		new EmployeeDao(),new EmployeeSalaryCalculator(),
		    		new XlsSalaryReport() 
		    		
			);
			
		 emplSalariesReportService.generateReport();
	 }

}
