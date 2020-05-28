package com.javatpoint.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.javatpoint.beans.Emp;


public class EmpExcelController extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		HSSFSheet excelSheet = (HSSFSheet) workbook.createSheet("Emp");
		setExcelHeader(excelSheet);
		
		List<Emp> emList = (List) model.get("empList");
		setExcelRows(excelSheet,emList);
	}

	private void setExcelRows(HSSFSheet excelSheet, List<Emp> emList) {
		int record = 1;
		for (Emp emp : emList) {
			HSSFRow excelRow = excelSheet.createRow(record++);
			excelRow.createCell(0).setCellValue(emp.getId());
			excelRow.createCell(1).setCellValue(emp.getName());
			excelRow.createCell(2).setCellValue(emp.getSalary());
			excelRow.createCell(3).setCellValue(emp.getDesignation());
		}
	}

	private void setExcelHeader(HSSFSheet excelSheet) {
		// TODO Auto-generated method stub
		HSSFRow excelHeader = excelSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("Id");
		excelHeader.createCell(1).setCellValue("Name");
		excelHeader.createCell(2).setCellValue("salary");
		excelHeader.createCell(3).setCellValue("designation");
		
	}
}
