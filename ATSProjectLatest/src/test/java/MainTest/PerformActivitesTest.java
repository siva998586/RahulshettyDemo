package MainTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class PerformActivitesTest {
	
	WebDriver driver;
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		 driver = launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}

		@Test(priority=1)
		public void Activities() throws InterruptedException {
		
		
			System.out.println("Activities");
			
						Thread.sleep(4000);
						
						// Talent Management Link Click
					//	driver.findElement(By.xpath("//a[normalize-space()='Talent Management']")).click();
						
						
						//driver.findElement(By.xpath("//a[normalize-space()='Candidate List']")).click();
						
						driver.findElement(By.xpath("//div[@class='form-group homedashboardtxt']//a[normalize-space()='Candidate List']")).click();
					
						
											
						//Click on any Candidate
						Thread.sleep(3000);
						

						 String originalWindow = driver.getWindowHandle();
							System.out.println("mainwindow ="+originalWindow);
						 
						 
							driver.findElement(By.linkText("Sivarama")).click();

							//Get the list of window handles
							
						/*	List<String> tabs=new ArrayList<String>(driver. getWindowHandles()) ;
							
							System.out.println(tabs.size());
							//Use the list of window handles to switch between windows
								driver.switchTo().window(tabs.get(1));
								System.out.println("Tab1 - " +tabs.get(0));
								System.out.println("Tab2 - " +tabs.get(1));  */
								
								
								
								// Click on Submit Activity icon
									driver.findElement(By.xpath("//button[@title='Submit Activities']")).click();
									// Click on Search button
									driver.findElement(By.xpath("//button[@title='More Search Options']")).click();
									
									//Click on Search Button for Search Jobs screen
									driver.findElement(By.xpath("//button[@id='search']//span[contains(text(),'Search')]")).click();
									Thread.sleep(1000);
						//   List<String> newtabs=new ArrayList<String>(driver. getWindowHandles()) ;
									
							//		System.out.println(newtabs.size());
							//		driver.switchTo().window(newtabs.get(2));
							//		System.out.println("Tab3 - " +newtabs.get(2));
							//			
									
							//		 System.out.println(driver.getTitle());
							//		 System.out.println(driver.getCurrentUrl());
																
							 Thread.sleep(2000);
							 WebElement JobTitle = (driver.findElement(By.xpath("//*[@id=\"grid-height\"]/div[1]/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[2]"))); 
							  Actions act = new Actions(driver); 
							 act.contextClick(JobTitle).build().perform(); //Right Click = Single Click
							 
							 //click on Select option for the Job
							 driver.findElement(By.xpath("(//span[@id='eName'])[1]")).click();
							 Thread.sleep(2000);
							 
							 driver.findElement(By.xpath("//input[@id='agreed_pay_rate_first']")).sendKeys("500000");
							 Thread.sleep(2000);
							 driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();
							 
							 //Popup message handle - get popup text 
							 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
							 String SubmitpopMSG =
									  driver.findElement(By.xpath("/html/body/div[25]/div[2]/div/div/div[1]/p")).
									  getText();
								System.out.println(SubmitpopMSG);
									  
									  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
									  driver.findElement(By.xpath("//button[normalize-space()='OK']")
									  ).click();
						   
									  // Logout and Login again 
									  
								driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/header/div[3]/ul/li[5]/a/div")).click();
								driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/header/div[3]/ul/li[5]/div/button[3]/span")).click();
								
								
								driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
								WebElement username1=driver.findElement(By.xpath("//input[@id='email']"));
								WebElement password1=driver.findElement(By.xpath("//input[@id='password']"));
								
								username1.sendKeys("atsin@abacusservice.in");
								password1.sendKeys("Abacus@123");
							
								WebElement Login=driver.findElement(By.id("loginBtn")); 
								Login.click();
								driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
								
								// Talent Management Link Click
								driver.findElement(By.xpath("//a[normalize-space()='Talent Management']")).click();
								
								
								driver.findElement(By.xpath("//a[normalize-space()='Candidate List']")).click();
								
													
								//Click on any Candidate
								driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
								
							
							//	 String originalWindow1 = driver.getWindowHandle();
							//		System.out.println("mainwindow ="+originalWindow1);
								 
								 
									driver.findElement(By.linkText("Sivarama")).click();
							
									//Get the list of window handles
									
								/*			List<String> tabs2=new ArrayList<String>(driver. getWindowHandles()) ;
									
										System.out.println(tabs2.size());
										//Use the list of window handles to switch between windows
										driver.switchTo().window(tabs2.get(2));
										*/
										
				
							// Click on Activity Arrow >
								driver.findElement(By.xpath("//a[@data-target='#accordionCollapseActivites']//i[@class='icon-arrow-right']")).click();
								// Select latest submit activity
								driver.findElement(By.xpath("//*[@id=\"accordionCollapseActivites\"]/div/div/div/div/div/table/tbody/tr[1]/td[1]/span/a/time")).click();
								//Click on Approve button
								driver.findElement(By.xpath("//*[@id=\"approve\"]/span[2]")).click();
								
								// Handle popup message
								driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
								String approveMSG =
									  driver.findElement(By.xpath("/html/body/div[38]/div[2]/div/div/div[1]/p")).
									  getText();
									  
									  System.out.println(approveMSG);
									  
									  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
									  driver.findElement(By.xpath("//button[normalize-space()='OK']")
									  ).click();
									  
									  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						  
						  // screen Logout
							driver.findElement(By.xpath("/html/body/div[1]/div/div/main/header/div[3]/ul/li[5]/a/div")).click();
							driver.findElement(By.xpath("/html/body/div[1]/div/div/main/header/div[3]/ul/li[5]/div/button[3]/span")).click();
							
							
							//Login Again
							
							WebElement username2=driver.findElement(By.xpath("//input[@id='email']"));
							WebElement password2=driver.findElement(By.xpath("//input[@id='password']"));
							
							username2.sendKeys("sivaramakrishna@trajectus.com");
							password2.sendKeys("Siva@123");
							
							
							WebElement Login3=driver.findElement(By.id("loginBtn")); 
							Login3.click();
							Thread.sleep(2000);
							
							// Talent Management Link Click
							driver.findElement(By.xpath("//a[normalize-space()='Talent Management']")).click();
							
							
							driver.findElement(By.xpath("//a[normalize-space()='Candidate List']")).click();
							
												
							//Click on any Candidate
							driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

							//						 String originalWindow1 = driver.getWindowHandle();
							//							System.out.println("mainwindow ="+originalWindow1);
							 
							 
								driver.findElement(By.linkText("Sivarama")).click();

								//Get the list of window handles
						/*	List<String> tabs3=new ArrayList<String>(driver. getWindowHandles()) ;
								
								System.out.println(tabs3.size());
								//Use the list of window handles to switch between windows
									driver.switchTo().window(tabs3.get(3)); */
				
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						// Click on Schedule an Interview
						driver.findElement(By.xpath("//button[@title='Schedule an Interview']")).click();
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						driver.findElement(By.xpath("//button[@title='More Search Options']//span[contains(text(),'Search')]")).click();
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						//Click on Search Button for Search Jobs screen
						driver.findElement(By.xpath("//button[@id='search']")).click();
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					
						// List<String> newtabs1=new ArrayList<String>(driver. getWindowHandles()) ;
						
						// System.out.println(newtabs1.size());
						// driver.switchTo().window(newtabs1.get(2));
						// System.out.println("Tab3 - " +newtabs1.get(2));
							
						
						//  System.out.println(driver.getTitle());
						 // System.out.println(driver.getCurrentUrl());
													
					WebElement JobTitle1 = (driver.findElement(By.xpath("//div[normalize-space()='Bookmyshow / Hyd']")));  
					Actions act1 = new Actions(driver); 
					act1.contextClick(JobTitle1).build().perform(); //Right Click = Single Click
					
					//click on Select option for the Job
					driver.findElement(By.xpath("(//span[@id='eName'])[1]")).click();
					Thread.sleep(2000);

					
					//Select Interview Level
					//driver.findElement(By.xpath("//div[@id='interview_level_id']//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Select']")).click();
					driver.findElement(By.xpath("//*[@id=\"interview_level_id\"]/div[3]/span")).click(); 
					driver.findElement(By.xpath("//li[normalize-space()='Level 1']")).click();
					
					//Select Interview Status
					driver.findElement(By.xpath("//*[@id=\"interview_level_status_id\"]/div[3]")).click();
					driver.findElement(By.xpath("//*[@id=\"interview_level_status_id\"]/div[4]/div/ul/li[4]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"save\"]/span[2]")).click(); 
					
					//Popup message handle - get popup text 
					Thread.sleep(2000);
					String ScheduleanInterviewMSG =
						  driver.findElement(By.xpath("/html/body/div[23]/div[2]/div/div/div[1]/p")).
						  getText();
						  
						  System.out.println(ScheduleanInterviewMSG);
						  
						  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
						  driver.findElement(By.xpath("//button[normalize-space()='OK']")
						  ).click();
		  


		  Thread.sleep(4000);  
		  
		  // Schedule a Start 
		  
		  driver.findElement(By.xpath("//button[@title='Schedule a Start']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@title='Search Jobs']//i[@class='fa fa-search']")).click();
			Thread.sleep(1000);
			//Click on Search Button for Search Jobs screen
			driver.findElement(By.xpath("//button[@id='search']//span[contains(text(),'Search')]")).click();
			Thread.sleep(1000);

		/*	List<String> newtabs1=new ArrayList<String>(driver. getWindowHandles()) ;
			
			System.out.println(newtabs1.size());
			driver.switchTo().window(newtabs1.get(2));
			System.out.println("Tab3 - " +newtabs1.get(2));
				*/
			
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
										
		Thread.sleep(1000);
		WebElement JobTitle2 = (driver.findElement(By.xpath("//div[normalize-space()='Bookmyshow / Hyd']"))); 
		Actions act2 = new Actions(driver); 
		act2.contextClick(JobTitle2).build().perform(); //Right Click = Single Click

		//click on Select option for the Job
		driver.findElement(By.xpath("(//span[@id='eName'])[1]")).click();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//input[@id='agreed_pay_rate_first']")).sendKeys("500000");
		//Thread.sleep(2000);
		
		//Enter Final Bill rate
		driver.findElement(By.xpath("//input[@id='schedules_final_bill_rate']")).sendKeys("50000");
		driver.findElement(By.xpath("//*[@id=\"schedules_final_bill_rate_id\"]/label")).click();
		driver.findElement(By.xpath("//div[@id='schedules_final_bill_rate_id']//li[@class='ui-dropdown-item ui-corner-all'][normalize-space()='Per Month']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='schedules_agreed_pay_rate']")).sendKeys("50000");
		
		driver.findElement(By.xpath("//*[@id=\"schedules_agreed_pay_rate_id\"]/label")).click();
		driver.findElement(By.xpath("//div[@id='schedules_agreed_pay_rate_id']//li[@class='ui-dropdown-item ui-corner-all'][normalize-space()='Per Month']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='internal_note']")).sendKeys("Schedule a Start created - and OnBoarded");

		driver.findElement(By.xpath("//*[@id=\"schedules_Status\"]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"schedules_Status\"]/div[4]/div/ul/li[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click(); 

		//Popup message handle - get popup text 
		Thread.sleep(1000);
		String ScheduStartMSG =
			  driver.findElement(By.xpath("/html/body/div[24]/div[2]/div/div/div[1]/p")).
			  getText();
			  
			  System.out.println(ScheduStartMSG);
			  
			  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
			  driver.findElement(By.xpath("//button[normalize-space()='OK']")
			  ).click();
		  
		  
		}}


