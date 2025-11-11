package LaunchBrowserTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Smoketest {
	WebDriver driver;
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		 driver = launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
		
		@Test(priority=1)
		public void Create_New_Company() throws InterruptedException, IOException {
				List<String> tabs=new ArrayList<String>(driver. getWindowHandles()) ;
				
				 System.out.println(tabs.size());
				//Use the list of window handles to switch between windows
					driver.switchTo().window(tabs.get(0));
					System.out.println("Tab1 - " +tabs.get(0));
			
				// driver.get("https://www.justdial.com/Bangalore/Bakeries");
			      // identify div elements with same class
			      List<WebElement> l = driver.findElements(By.className("nav"));
			      // list iteration
			      System.out.println("Elements are: ");
			      for(int j = 0; j< l.size(); j++) {
			         //identify separate div
			         String v = l.get(j).getText();
			         System.out.println("Elements are: ");
			         System.out.println(v);
			      }
				
			      
			      WebElement overlayDiv = driver.findElement(By.className("opecity-div"));
			      overlayDiv.click(); // Click or interact with the overlay element to dismiss it
			      WebElement crmDropdownToggle = driver.findElement(By.xpath("//a[text()='CRM']"));
			      crmDropdownToggle.click();
			      WebElement Company = driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='New Company']"));
			      Company.click();
			      
			      
			      Thread.sleep(1000);
			     
			         // Click on New Contact
			
				        File file =    new File("D:\\ATS Source\\AtsTestData.xlsx");
				        
				        //Create an object of FileInputStream class to read excel file
				        FileInputStream inputStream = new FileInputStream(file);
				        
				        //Creating workbook instance that refers to .xls file
				        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
				        
				        //Creating a Sheet object using the sheet Name
				        XSSFSheet CRM_Company=wb.getSheet("CRM_Company");
				        
				        //Create a row object to retrieve row at index 1
				        XSSFRow row2=CRM_Company.getRow(1);
				        
				        //Create a cell object to retreive cell at index 5
				        XSSFCell cell=row2.getCell(5);
				        
				        //Get the address in a variable
				        String address= cell.getStringCellValue();
				        
				        //Printing the address
				       // System.out.println("Address is :"+ address);
									
									Thread.sleep(4000);
									XSSFCell Cell1=row2.getCell(0);
							        
							        //Get the address in a variable
							        String CompanyName= Cell1.getStringCellValue();
									// Enter New Company Name
									driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(CompanyName);
									driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
									driver.findElement(By.xpath("//label[normalize-space()='Select State']")).click();
									driver.findElement(By.xpath("//li[normalize-space()='AP - Andhra Pradesh']")).click();
									
									// Click on SAVE 
									driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
									
									//Popup message handle - get popup text 
									 Thread.sleep(2000);
									 String AddCompupMsg =
											  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/p")).
											  getText();
											  
											  System.out.println(AddCompupMsg);
											  
											  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
											  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/button")
											  ).click();
								
		}							  
		@Test(priority=2)
		public void Create_New_Contact() throws IOException, InterruptedException  {
						
								  // Navigating to New Contact page
								  
								  
								  Thread.sleep(2000);
								 // click new contact page 
								  WebElement NewContactLink = driver.findElement(By.xpath("//a[normalize-space()='New Contact']"));
								  NewContactLink.click();
								  
								/*  List<String> tabs=new ArrayList<String>(driver. getWindowHandles()) ;
									
									//System.out.println(tabs.size());
									//Use the list of window handles to switch between windows
										driver.switchTo().window(tabs.get(0));
										System.out.println("Tab1 - " +tabs.get(0));
										//System.out.println("Tab2 - " +tabs.get(1)); */
								  
								  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
									Thread.sleep(4000);
									
							        File file =    new File("D:\\ATS Source\\AtsTestData.xlsx");
							        
							        //Create an object of FileInputStream class to read excel file
							        FileInputStream inputStream = new FileInputStream(file);
							        
							        //Creating workbook instance that refers to .xls file
							        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
							        
							   
									
									//Creating a Sheet object using the sheet Name
							        XSSFSheet CRM_Contact= wb.getSheet("CRM_Contact");
							        
							        //Create a row object to retrieve row at index 1
							        XSSFRow row1=CRM_Contact.getRow(1);
							        
							        //Create a cell object to retreive cell at index 5
							        XSSFCell FName=row1.getCell(0);
							        XSSFCell LName=row1.getCell(1);
							        
							        
							        //Get the First name and Last name in a variable
							        String FirstName= FName.getStringCellValue();
							        String LastName= LName.getStringCellValue();
							        
							        //String ContactType= LName.getStringCellValue();
							        
																				
// Enter Fname,Lname, Contact
							        
							      //driver.findElement(By.xpath("//*[@id=\"first_name\"]")).click();
							        
								  driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys(FirstName);
								  driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys(LastName);
								  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
								  // Contact select and Click
								  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/label[1]")).click();
								  driver.findElement(By.xpath("//div[@id='contact_types']//li[3]")).click();
								  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
								  
								  // Company select and Click
								  driver.findElement(By.xpath("//label[normalize-space()='Select Company']")).click();
								  driver.findElement(By.xpath("//div[@id='company']//li[3]")).click();
								  
								  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
								
								  // SAVE it
								  driver.findElement(By.xpath("//*[@id=\"submit\"]/span[2]")).click();
								  
								  Thread.sleep(2000);
									 String AddContactMsg =
											  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/p")).
											  getText();
											  
											  System.out.println(AddContactMsg);
											  
											  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
											  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/button")
											  ).click();
	  }
								
		@Test(priority=3)
		public void Crate_New_Recruiter() throws InterruptedException, IOException {
		//	Navigate Admin link	and Adding Recruiters one
											  
			 Thread.sleep(4000);						
				
					WebElement AdminLink = driver.findElement(By.xpath("//a[text()='Admin']"));
					 AdminLink.click();
							
				driver.findElement(By.xpath("//a[normalize-space()='Create Recruiter']")).click();
				 Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//div[@class='form-group homedashboardtxt']//a[normalize-space()='Create Recruiter']")).click();
	
        File file =    new File("D:\\ATS Source\\AtsTestData.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //Creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
     
		//Creating a Sheet object using the sheet Name
        XSSFSheet CRM_CreateRecruiter=wb.getSheet("CRM_CreateRecruiter");
        
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
		//Abacus Service Corporation Division
		
		driver.findElement(By.xpath("//label[normalize-space()='Select Division']")).click();
		driver.findElement(By.xpath("//*[@id=\"division\"]/div[4]/div[2]/ul/li[1]")).click();
		
		//AssignRole
		driver.findElement(By.xpath("//*[@id=\"role\"]/label")).click();
		driver.findElement(By.xpath("//div[@id='role']//li[1]")).click();
		//*[@id="role"]/label
		
		//Select State dropdown and select state
		driver.findElement(By.xpath("//label[normalize-space()='Select State']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='AP - Andhra Pradesh']")).click();
		
		
		// enter email
		driver.findElement(By.xpath("//*[@id=\"accordionMailPassword\"]/div[1]/div[1]/input")).sendKeys(Email1);
		
		// enter password and conform password
		System.out.println("Password" +Psw1);
		System.out.println("Confirm Password is:"+Confpsw1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Psw1);
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys(Confpsw1);
		
		//SAVE button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
		

		
		Thread.sleep(3000);
		String AddRecruitertMsg =
				  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/p")).
				  getText();
				  
				  System.out.println(AddRecruitertMsg);
				  
				  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
				  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/button")
				  ).click();
		
		
				  Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/ul/li[3]/ul/li[1]/a")).click();
					
					Thread.sleep(3000);
					driver.navigate().refresh();
					
		
		}
		
		@Test(priority=4)
		public void Create_New_Job() throws InterruptedException, IOException {
					
	// Create New Job from Job ManageMennt
			Thread.sleep(1000);
			
			 File file =    new File("D:\\ATS Source\\AtsTestData.xlsx");
		        
		        //Create an object of FileInputStream class to read excel file
		        FileInputStream inputStream = new FileInputStream(file);
		        
		        //Creating workbook instance that refers to .xls file
		        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
			
		       // String ContactType= LName.getStringCellValue();
		        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  driver.findElement(By.xpath("//a[normalize-space()='Job Management']")).click();
					  driver.findElement(By.xpath("//a[normalize-space()='New Job']")).click();
					
					  Thread.sleep(2000);
					  
		//Creating a Sheet object using the sheet Name
		 XSSFSheet New_Job=wb.getSheet("New_Job");
		
		//Create a row object to retrieve row at index 1
		XSSFRow NJrow=New_Job.getRow(1);
		
		//Create a cell object to retreive cell at index 5
		XSSFCell Titlerow=NJrow.getCell(0);
		
		//Get the First name and Last name in a variable
		String Title= Titlerow.getStringCellValue();
		
		//Add Title field
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys(Title);
		
				
		// Select Position Type
		driver.findElement(By.xpath("//label[normalize-space()='Select Position']")).click();
		
		driver.findElement(By.xpath("//li[normalize-space()='Contract']")).click();
		Thread.sleep(1000);
		
		//Select Division
		driver.findElement(By.xpath("//label[normalize-space()='Select Division']")).click();
		driver.findElement(By.xpath("(//li[normalize-space()='ATS India'])[1]")).click();
		Thread.sleep(1000);
		
		//Select Job Status
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Select Status']")).click();
		driver.findElement(By.xpath("(//li[normalize-space()='Open'])[1]")).click();
		
		
		//Select Contact
		Thread.sleep(1000);
		// Click the dropdown trigger to open the dropdown.
		driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/form/div/div[2]/div[1]/div[1]/div[2]/div/div/div[8]/div/label")).click();

		// Wait for the dropdown options to become visible (you may use explicit waits here).

		// Locate and click a specific contact option by text.
		driver.findElement(By.xpath("//li[normalize-space()='Aditya A']")).click();
		 //Select Company/Dep
		
												
		//Select State dropdown and select state
		driver.findElement(By.xpath("//*[@id=\"states\"]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"states\"]/div[4]/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		
		// Select Approver/Team Lead
		driver.findElement(By.xpath("//body//div//div//div//main//div//div//form//div//div//div//div//div//div//div//div//div//label[contains(text(),'Approver/Team Lead')]")).click();
		driver.findElement(By.xpath("(//li[contains(text(),'Abacus Admin')])[1]")).click();
		Thread.sleep(1000);
		// Select Primary recruiter
		driver.findElement(By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Choose']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[24]/div[1]/div[4]/div[2]/ul[1]/li[54]")).click();
		Thread.sleep(1000);
		// Select Recruiter
		
		 /* driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[26]/div/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[26]/div/div[4]/div[2]/ul/li[2]")).click(); */
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"description\"]/div[2]/div[1]")).click();
		Thread.sleep(1000);
		//SAVE button
		
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		
		Thread.sleep(1000);
		 String NewJobpopMsg =
				  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
				  getText();
				  
				  System.out.println(NewJobpopMsg);
				  Thread.sleep(1000);
				  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
				  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
				  ).click();
					  
							  
		}
}
	


