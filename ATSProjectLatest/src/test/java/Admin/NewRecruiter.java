package Admin;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewRecruiter {
	
	 WebDriver driver;
	 
		public void BrowserLaunch() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SivaramData\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		    
		// LaunchWebsite  
		driver.navigate().to("http://192.168.1.96/#/login");
		    
		driver.manage().window().maximize(); 

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//enter email id
		driver.findElement(By.name("email")).sendKeys("sivaramakrishna@trajectus.com");
		    
		//enter password
		driver.findElement(By.name("password")).sendKeys("Siva@123");
		    
		//Click on login Button
		    
		driver.findElement(By.xpath("//button[@id='loginBtn']//span[2]")).click();
		
		}
		
				
		public void addRecruiter() throws InterruptedException, IOException {
			
		//	driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div[@match='[object Object]']/ul/li[3]/a[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[normalize-space()='Create Recruiter'])[2]")).click();
			Thread.sleep(2000);
			
			//Create an object of File class to open xlsx file
	        File file = new File("D:\\ATS Source\\AtsTestData.xlsx");
	        
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
	        XSSFCell Email=CCrow1.getCell(15);
	        XSSFCell Psw=CCrow1.getCell(17);
	        XSSFCell Confpsw=CCrow1.getCell(18);
	        
	        //Get the First name and Last name in a variable
	        String FtName1= FtName.getStringCellValue();
	        String LastName2= LtName.getStringCellValue();
	        String Email1= Email.getStringCellValue();
	        String Psw1= Psw.getStringCellValue();
	        String Confpsw1= Confpsw.getStringCellValue();
	        // String ContactType= LName.getStringCellValue();
	        		
	        //driver.findElement(By.xpath("//*[@id=\"first_name\"]")).click();
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(FtName1);
										 
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(LastName2);		
			driver.findElement(By.xpath("//label[normalize-space()='Select Division']")).click();
			driver.findElement(By.xpath("//*[@id=\"division\"]/div[4]/div[2]/ul/li[1]")).click();
			
			//Assign Roles 
			driver.findElement(By.xpath("//*[@id=\"role\"]/label")).click();
			driver.findElement(By.xpath("//li[normalize-space()='CEO']")).click();
			//*[@id="role"]/label
			
			//Select State dropdown and select state
			driver.findElement(By.xpath("//*[@id=\"states\"]/label")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"states\"]/div[4]/div[2]/ul/li[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"accordionMailPassword\"]/div[1]/div[1]/input")).sendKeys(Email1);
			
			System.out.println("Password: " +Psw1);
			System.out.println("Confirm Password is: "+Confpsw1);
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Psw1);
			driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys(Confpsw1);
			
			//SAVE button
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
			
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);;
			String AddRecruitertMsg = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/p")).getText();
					  
			System.out.println(AddRecruitertMsg);
					  
			//POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/button")).click();
						
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/ul/li[3]/ul/li[1]/a")).click();
			
		}
		
}
	