package JobManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchJobPage {

		WebDriver driver;
	
		public SearchJobPage() throws InterruptedException, IOException {
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[normalize-space()='Job Management']")).click();
			
			
			
				// Click on Search Job Link
				driver.findElement(By.xpath("//a[normalize-space()='Search Jobs']")).click();

				// Create an object of File class to open xlsx file
				File file = new File("D:\\ATS Source\\AtsTestData.xlsx");

				// Create an object of FileInputStream class to read excel file
				FileInputStream inputStream = new FileInputStream(file);

				// Creating workbook instance that refers to .xls file
				XSSFWorkbook wb = new XSSFWorkbook(inputStream);

				// Creating a Sheet object using the sheet Name
				XSSFSheet Search_Job = wb.getSheet("Search_Job");

				// Create a row object to retrieve row at index 1
				XSSFRow row2 = Search_Job.getRow(1);

				// Create a cell object to retreive cell at index 5
				XSSFCell cell = row2.getCell(6);

				// Get the address in a variable
				// int ATSID= (int) cell.getNumericCellValue();

				String ClintID = cell.getStringCellValue();
				// Printing the address
				System.out.println("Address is :" + ClintID);

				// Search with Client ID through Excel cell
				// driver.findElement(By.xpath("//input[@placeholder='Client
				// ID']")).sendKeys(String.valueOf(ATSID));
				driver.findElement(By.xpath("//input[@placeholder='Client ID']")).sendKeys(ClintID);

				// Click on Search button
				// driver.findElement(By.xpath("//div[@class='col-lg-12 mt-3
				// mb-2']//i[@class='fa fa-search']")).click();

			}
		

		

	}
