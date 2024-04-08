package com.sagar.qa.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class TestUtil {
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;

	public static String testDataPath = "C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\selenium_page_object_model\\src\\main\\java\\com\\sagar\\qa\\testdata\\testdata.xlsx";

	static Workbook book;
	static Sheet sheet;

	public Object[][] getTestData(String sheetName){
		FileInputStream file=null;

		try{
			file=new FileInputStream(testDataPath);
			book = WorkbookFactory.create(file);
		} catch (IOException | InvalidFormatException e) {
			throw new RuntimeException(e);
		}
		sheet = book.getSheet(sheetName);

		int totalRows = sheet.getLastRowNum();
		Row rowCells = sheet.getRow(0);
		int totalCols = rowCells.getLastCellNum();

		Object[][] data = new Object[totalRows][totalCols];
		for (int i = 0; i < totalRows; i++) {
			for (int j = 0; j < totalCols; j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return  data;
	}
}
