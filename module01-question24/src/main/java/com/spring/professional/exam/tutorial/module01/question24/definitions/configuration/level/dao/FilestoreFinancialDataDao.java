package com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialYearSummary;


public class FilestoreFinancialDataDao implements FinancialDataDao {

	@Override
	public FinancialYearSummary findFinancialYearSummary(int year) {
		System.out.println("Filestore Dao => findFinancialYearSummary");
		return new FinancialYearSummary();
	}

	@Override
	public FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter) {
		System.out.println("Filestore Dao => findFinancialQuarterSummary");
		return new FinancialQuarterSummary();
	}

	@Override
	public FinancialMonthSummary findFinancialMonthSummary(int year, int month) {
		System.out.println("Filestore Dao => findFinancialMonthSummary");
		return new FinancialMonthSummary();
	}
}
