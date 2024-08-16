package com.vtiger.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readDataFromExcel(String sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fis=new FileInputStream(Iconstantpaths.excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
}
