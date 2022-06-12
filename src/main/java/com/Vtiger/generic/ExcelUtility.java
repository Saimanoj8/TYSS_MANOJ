package com.Vtiger.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	
	public String readdatafromexcel(String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\bharath reddy\\Desktop\\Tech.xlsx");
		return WorkbookFactory.create(fis).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		
		
	}
	public int readNumericdatafromExcel(String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\bharath reddy\\Desktop\\Tech.xlsx");
		int value = (int) WorkbookFactory.create(fis).getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
		return value;
	}
	public int getLastRow(String sheetname) throws Throwable {
		FileInputStream fis= new FileInputStream("C:\\Users\\bharath reddy\\Desktop\\Tech.xlsx");
		int value1 = (int) WorkbookFactory.create(fis).getSheet(sheetname).getLastRowNum();
		return value1;
	}

}
