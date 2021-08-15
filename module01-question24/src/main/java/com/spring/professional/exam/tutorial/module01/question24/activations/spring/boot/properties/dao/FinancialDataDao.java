package com.spring.professional.exam.tutorial.module01.question24.activations.spring.boot.properties.dao;

import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialYearSummary;

public interface FinancialDataDao {
	
	FinancialYearSummary findFinancialYearSummary(int year);
	FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);
	FinancialMonthSummary findFinancialMonthSummary(int year, int month);

}
