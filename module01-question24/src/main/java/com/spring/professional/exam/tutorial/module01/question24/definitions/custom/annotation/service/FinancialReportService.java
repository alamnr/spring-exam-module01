package com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.dao.FinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialYearSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.writer.FinancialReportWriter;

@Component
public class FinancialReportService {
	
	private final FinancialDataDao financialDataDao;
	private final FinancialReportWriter financialReportWriter;
	
	
	public FinancialReportService(FinancialDataDao financialDataDao, FinancialReportWriter financialReportWriter) {
		this.financialDataDao = financialDataDao;
		this.financialReportWriter = financialReportWriter;				
	}
	
	public void generateReport() {
		this.financialDataDao.findFinancialMonthSummary(0, 0);
		this.financialDataDao.findFinancialQuarterSummary(0, 0);
		this.financialDataDao.findFinancialYearSummary(0);
		
		this.financialReportWriter.appendFreetext("");
		this.financialReportWriter.appendFinancialMonthSummary(new FinancialMonthSummary());
		this.financialReportWriter.appendFinancialQuarterSummary(new FinancialQuarterSummary());
		this.financialReportWriter.appendFinancialYearSummary(new FinancialYearSummary());
		
	}

}
