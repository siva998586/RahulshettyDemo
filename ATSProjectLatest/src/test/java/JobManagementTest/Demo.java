package JobManagementTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class Demo {
	 WebDriver driver;
	 
	 
		@Test(priority=0)
		public void BrowserLaunch() throws InterruptedException {
			ATSLoginTest launch = new ATSLoginTest();
			launch.BrowserLaunch();
			launch.EnterLoginCredentials();
		}
		@Test(priority=1)
		public void addRecruiter() throws InterruptedException, IOException {
			
			driver.findElement(By.xpath("//div[@class='form-group homedashboardtxt']//a[normalize-space()='Create Recruiter']")).click();
			 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			
			//Create an object of File class to open xlsx file
	        File file = new File("D:\\DemoFile.xlsx");
	        
	        //Create an object of FileInputStream class to read excel file
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        //Creating workbook instance that refers to .xls file
	        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
	      
			//Creating a Sheet object using the sheet Name
	        XSSFSheet CRM_CreateRecruiter = wb.getSheet("CRM_CreateRecruiter");
	        
	           
	        
	        //Create a row object to retrieve row at index 1
	        XSSFRow CCrow1=CRM_CreateRecruiter.getRow(1);
	        
	        //Create a cell object to retreive cell at index 5
	        XSSFCell FtName=CCrow1.getCell(1);
	        XSSFCell LtName=CCrow1.getCell(2);
	        XSSFCell Divi=CCrow1.getCell(3);
	        XSSFCell roles=CCrow1.getCell(4);
	        XSSFCell Stat=CCrow1.getCell(5);
	        XSSFCell email=CCrow1.getCell(6);
	        XSSFCell paswd=CCrow1.getCell(7);
	        XSSFCell Confpaswd=CCrow1.getCell(8);
	        
	        
	        String FtName1= FtName.getStringCellValue();
	        String LastName2= LtName.getStringCellValue();
	        String Division= Divi.getStringCellValue();
	        String Role= roles.getStringCellValue();
	        String States= Stat.getStringCellValue();
	        String Email= email.getStringCellValue();
	        String PSWD= paswd.getStringCellValue();
	        String CNFPWD= Confpaswd.getStringCellValue();
	        
	        
	        
	        System.out.println(Division);
	        // Enter First Name and Last Name
	        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(FtName1);
	        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(LastName2);
	        
	        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	        // Find the dropdown trigger element
	        WebElement dropdownTrigger = driver.findElement(By.id("division"));

	        // Create an Actions object to simulate user actions
	        Actions actions = new Actions(driver);

	        // Click on the dropdown trigger to open the dropdown
	        actions.click(dropdownTrigger).build().perform();

	        
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement optionToSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(), '" + Division + "')]")));
	        
	        
	        // Find and click the desired option within the dropdown
	       // WebElement optionToSelect = driver.findElement(By.xpath("//li[contains(text(), '\"+Division+\"')]"));
	        optionToSelect.click();

	        
	        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	        
	     // Find the dropdown trigger element
	        WebElement role = driver.findElement(By.id("role"));
	        
	     // Click on the dropdown trigger to open the dropdown
	        actions.click(role).build().perform();

	        // Find and click the desired option within the dropdown
	        WebElement RoleToSelect = driver.findElement(By.xpath("//li[contains(text(),  '"+Role+"')]"));
	        RoleToSelect.click();
	        
	        
	        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	        
		     // Find the dropdown trigger element
		        WebElement state = driver.findElement(By.id("states"));
		        
		     // Click on the dropdown trigger to open the dropdown
		        actions.click(state).build().perform();

		        // Find and click the desired option within the dropdown
		        WebElement statesToSelect = driver.findElement(By.xpath("//li[contains(text(),  '"+States+"')]"));
		        statesToSelect.click();
	        
	        
		        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		        
		        // Enter email 
		        driver.findElement(By.cssSelector("input[placeholder='example@mail.com']")).sendKeys(Email);
		        
		        
		        
		        // Password and Confirm Password field validation test cases
		        WebElement passwordField = driver.findElement(By.id("password"));
		        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
		        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		        WebElement submitButton = driver.findElement(By.id("submitTo"));
		        
		        
		        String password = PSWD;
		        String confirmPassword = CNFPWD;

		        passwordField.sendKeys(password);
		        confirmPasswordField.sendKeys(confirmPassword);

		        if (password.equals(confirmPassword)) {
		            submitButton.click();
		            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		            driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		            System.out.println("Recruiter Created Successfully!," );
		        } else {
		        	submitButton.click();
		        	
		        	System.out.println("Passwords do not match," );
		        }
		       
		        
	        // Close the browser
	        driver.quit();
	      
		}}
		

