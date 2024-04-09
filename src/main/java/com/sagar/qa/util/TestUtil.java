package com.sagar.qa.util;

import com.sagar.qa.base.TestBase;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;

	public static String testDataPath = "C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\selenium_page_object_model\\src\\main\\java\\com\\sagar\\qa\\testdata\\testdata.xlsx";

	static Workbook book;
	static Sheet sheet;

	public  void failedTest(String FTname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File SFile = ts.getScreenshotAs(OutputType.FILE);
		File DFile = new File(".\\BS_ScreenShots\\"+ FTname + ".png");
		FileHandler.copy(SFile, DFile);
	}

	public Object[][] getTestData(String sheetName){
		FileInputStream file=null;

		try{
			file=new FileInputStream(testDataPath);
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
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
