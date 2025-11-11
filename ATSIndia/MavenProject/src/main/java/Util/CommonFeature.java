package com.Ats.qa.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Ats.qa.Base.TestBase;

public class CommonFeature extends TestBase {

	public static long Page_load = 10;
	public static long Imp_wait = 30;
	public static String Candidate_List ="C:\\Users\\Supriyo Sen\\eclipse-workspace\\ATS\\src\\main\\java\\com\\Ats\\qa\\Testdata\\ATS_TestData.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	
	
	

	public static Object[][] getTestData(String sheetname) {
		FileInputStream file = null;
		try {
				file = new FileInputStream(Candidate_List);	
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
		book = WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println(sheet.getLastRowNum()+"--------"+sheet.getRow(0).getLastCellNum());
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j] = sheet.getRow(1+i).getCell(j).toString();
				//System.out.println(data[i][j]);
				}
		}
		
		return data;
	}
	
	public static void takeScreenshotAtEndOfTest() throws IOException  {
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String currentDir = System.getProperty("C:\\Users\\Supriyo Sen\\eclipse-workspace\\ATS\\Screenshot");
		FileUtils.copyFile(srcfile, new File(currentDir+"/screenshot/"+System.currentTimeMillis() + ".png"));
	}
	
}
