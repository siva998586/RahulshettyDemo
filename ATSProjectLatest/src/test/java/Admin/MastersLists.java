package Admin;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import LaunchBrowserTest.ATSLoginTest;

public class MastersLists {
	WebDriver driver;
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		 driver = launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	
	@Test(priority=1)
public void MasterList() throws InterruptedException {
		
		//Click on @Admin Link
				/* WebElement Admin_Link= driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/ul/li[3]/a"));
					Admin_Link.click();
					
					driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); */
					//Click on @Masters List Link
					WebElement Master_Link= driver.findElement(By.xpath("//div[@class='form-group homedashboardtxt']//a[normalize-space()='Master List']"));
					Master_Link.click();
					
					driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					
					  // click on Add contact button 
					Thread.sleep(2000);
					WebElement AddCONTACTButton= driver.findElement(By.xpath(
					  "/html/body/div[1]/div/div/main/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/span/button"));
					   AddCONTACTButton.click(); 
					  driver.manage().timeouts().pageLoadTimeout(20,
					  TimeUnit.SECONDS);
					  Thread.sleep(2000);
					  // Add data 
					  WebElement AddCONTACTinfo = driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']"));
					  AddCONTACTinfo.sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  String ContactMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(ContactMSG + "Record Added Success");
					  
					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualContactMsg = "Contact Type Added Successfully!";
						  if(ActualContactMsg.equals(ContactMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + ContactMSG);
						    }
						        else {
						            System.out.println("Fail - Contact type popup message text is not matching");
						        }
					  
					  
					  //Click on OK button for POPUp
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					  
					  // click on Add POSITION Type button
					  Thread.sleep(2000);
					  WebElement AddPOSITIONButton=
					  driver.findElement(By.xpath("//button[@id='2']")); AddPOSITIONButton.click();
					  
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  Thread.sleep(2000);
					  WebElement AddPOSITIONinfo =
					  driver.findElement(By.xpath("//input[@placeholder='Add list']"));
					  AddPOSITIONinfo.sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
					  
					  
					  String positiontypeMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(positiontypeMSG);
					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualpositiontypeMSG = "Position Type Added Successfully!";
						  if(ActualpositiontypeMSG.equals(positiontypeMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + positiontypeMSG);
						    }
						        else {
						            System.out.println("Fail - Position type popup message text is not matching");
						        }
					  
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					  
					  // click on Add EDUCATION CATEGORY button 
					  Thread.sleep(2000);
					  
					  WebElement ADDEDUCATIONCATEGORY=driver.findElement(By.xpath(
					  "/html/body/div[1]/div/div/main/div/div/div/div[2]/div/div/div/div/div[5]/div/div[2]/span/button"
					  )); ADDEDUCATIONCATEGORY.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  Thread.sleep(2000);
					  // Add EDUCATION CATEGORY
					  driver.findElement(By.xpath("//input[@placeholder='Add list']")).sendKeys(
					  "abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String EDUCATIONMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(EDUCATIONMSG);
					   Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualEDUCATIONMSG = "Education Category Added Successfully!";
						  if(ActualEDUCATIONMSG.equals(EDUCATIONMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + EDUCATIONMSG);
						    }
						        else {
						            System.out.println("Fail - Education popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")).click();
					 
					  // click on Add PAY RATE UNIT button 
					  Thread.sleep(2000);
					  
					  WebElement
					  ADDPAYRATE=driver.findElement(By.xpath("//button[@title='Add Pay Rate Unit']"
					  )); ADDPAYRATE.click(); driver.manage().timeouts().pageLoadTimeout(20,
					  TimeUnit.SECONDS);
					  
					  // Add Pay Rate unit
					  Thread.sleep(2000);
					  driver.findElement(By.xpath("(//input[@placeholder='Add list'])[1]")).
					  sendKeys("Test");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String ADDPAYRATEinfo =
					  driver.findElement(By.xpath("//html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(ADDPAYRATEinfo); Thread.sleep(1000); 
					  
					   Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualADDPAYRATEinfo = "Pay Rate Unit Added Successfully!";
						  if(ActualADDPAYRATEinfo.equals(ADDPAYRATEinfo)){
						        System.out.println(" Pass - popup message text comparision is Matching" + ADDPAYRATEinfo);
						    }
						        else {
						            System.out.println("Fail - Pay Rate popup message text is not matching");
						        }
					  
					   //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")).click();
					  
					  // click on Add WORK AUTHORIZATION button 
					  Thread.sleep(2000);
					   WebElement ADDWORKAUTHORIZATION=driver.findElement(By.
					  xpath("//button[@title='Add Work Authorization']"));
					  ADDWORKAUTHORIZATION.click(); driver.manage().timeouts().pageLoadTimeout(20,
					  TimeUnit.SECONDS);
					  Thread.sleep(2000);
					  // Add WORK AUTHORIZATION
					  driver.findElement(By.xpath("//input[@placeholder='Add list']")).sendKeys(
					  "abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
					  
					  
					  String AUTHORIZATION
					  =driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(AUTHORIZATION);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String AUTHORIZATIONMSG = "Work Authorization Added Successfully!";
						  if(AUTHORIZATIONMSG.equals(AUTHORIZATION)){
						        System.out.println(" Pass - popup message text comparision is Matching" + AUTHORIZATION);
						    }
						        else {
						            System.out.println("Fail - AUTHORIZATION type popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					  
					
					  // click on Add JOB STATUS button
					  
					  Thread.sleep(2000);
					  
					  WebElement
					  JobStatus=driver.findElement(By.xpath("//button[@title='Add Job Status']"));
					  JobStatus.click(); driver.manage().timeouts().pageLoadTimeout(20,
					  TimeUnit.SECONDS); // Add JOB STATUS
					  Thread.sleep(2000);
					  driver.findElement(By.xpath("//input[@placeholder='Add list']")).sendKeys(
					  "abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
					  
					  //popup message 
					  String JobStatusMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(JobStatusMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualJobStatusMSG = "Job Status Added Successfully!";
						  if(ActualJobStatusMSG.equals(JobStatusMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + JobStatusMSG);
						    }
						        else {
						            System.out.println("Fail - Job Status popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("//button[normalize-space()='OK']") ).click();
					  
					
					
					  // click on Add JOB PRIORITY button 
					  Thread.sleep(2000);
					  
					  WebElement
					  JOBPRIORITY=driver.findElement(By.xpath("//button[@title='Add Job Priority']"
					  )); JOBPRIORITY.click(); driver.manage().timeouts().pageLoadTimeout(20,
					  TimeUnit.SECONDS);
					  Thread.sleep(2000);
					  // Add EDUCATION CATEGORY 
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
					  
					  
					  String JOBPRIORITYMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(JOBPRIORITYMSG);
					  

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualJOBPRIORITYMSG = "Job Priority Added Successfully!";
						  if(ActualJOBPRIORITYMSG.equals(JOBPRIORITYMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + JOBPRIORITYMSG);
						    }
						        else {
						            System.out.println("Fail - Job Priority popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON OK BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					  
					
					  // click on Add EEVENTS PRIORITY button 
					  Thread.sleep(2000);
					  
					  WebElement EEVENTSPRIORITY=driver.findElement(By.xpath(
					  "//button[@title='Add Events Priority']" )); EEVENTSPRIORITY.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  
					  // Add EVENTS PRIORITY
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
					  
					  
					  String EEVENTSPRIORITYMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(EEVENTSPRIORITYMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualEEVENTSPRIORITYMSG = "Events Priority Added Successfully!";
						  if(ActualEEVENTSPRIORITYMSG.equals(EEVENTSPRIORITYMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + EEVENTSPRIORITYMSG);
						    }
						        else {
						            System.out.println("Fail - Events Priority popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					 
					
					  // click on Add JOB REQUIREMENT button 
					  Thread.sleep(2000);
					  
					  WebElement JOBREQUIREMENT=driver.findElement(By.xpath(
					  "//button[@title='Add Job Requirement']" )); JOBREQUIREMENT.click();
					  
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  // Add JOB  REQUIREMENT
					  Thread.sleep(2000);
					  driver.findElement(By.xpath("//input[@placeholder='Add list']")).sendKeys(
					  "abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  String JOBREQUIREMENTMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(JOBREQUIREMENTMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualJOBREQUIREMENTMSG = "Job Requirement Added Successfully!";
						  if(ActualJOBREQUIREMENTMSG.equals(JOBREQUIREMENTMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + JOBREQUIREMENTMSG);
						    }
						        else {
						            System.out.println("Fail - JOB REQUIREMENT popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					 
					 
					
							
					
					  // click on Add ACTIONS button
					  
					  Thread.sleep(2000);
					  
					  WebElement ACTIONS=driver.findElement(By.xpath(
					  "//button[@title='Add Actions']" )); ACTIONS.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  
					  // Add ACTIONS
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String ACTIONSMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(ACTIONSMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualACTIONSMSG = "Action Added Successfully!";
						  if(ActualACTIONSMSG.equals(ACTIONSMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + ACTIONSMSG);
						    }
						        else {
						            System.out.println("Fail - ACTIONS popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					  
					  
					  
					  // click on Add REMINDERS button 
					  Thread.sleep(2000);
					  
					  WebElement
					  REMINDERS=driver.findElement(By.xpath("//button[@title='Add Reminders']"));
					  REMINDERS.click(); driver.manage().timeouts().pageLoadTimeout(20,
					  TimeUnit.SECONDS);
					  
					  // Add REMINDERS info
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String REMINDERSMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(REMINDERSMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualREMINDERSMSG = "Remainder Added Successfully!";
						  if(ActualREMINDERSMSG.equals(REMINDERSMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + REMINDERSMSG);
						    }
						        else {
						            System.out.println("Fail - REMINDERS popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					 
					 
					
							
					
					  // click on Add EXPERIENCE LEVELS button 
					  Thread.sleep(2000);
					  
					  WebElement EXPERIENCE=driver.findElement(By.xpath(
					  "//button[@title='Add Experience Levels']" )); EXPERIENCE.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  
					  // Add EXPERIENCE CATEGORY
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String EXPERIENCEMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(EXPERIENCEMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualEXPERIENCEMSG = "Experience Level Added Successfully!";
						  if(ActualEXPERIENCEMSG.equals(EXPERIENCEMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + EXPERIENCEMSG);
						    }
						        else {
						            System.out.println("Fail - EXPERIENCE LEVELS popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
			
					  // click on Add TASK TYPE button 
					  Thread.sleep(2000);
					  
					  WebElement TASKTYPE=driver.findElement(By.xpath(
					  "//button[@title='Add Task Type']" )); TASKTYPE.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  
					  // Add TASK TYPE
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String TASKTYPEMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(TASKTYPEMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualTASKTYPEMSG= "Task Type Added Successfully!";
						  if(ActualTASKTYPEMSG.equals(TASKTYPEMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + TASKTYPEMSG);
						    }
						        else {
						            System.out.println("Fail - TASK TYPE  popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					 
					 
					  // click on Add CONTACT METHODS button 
					  Thread.sleep(2000);
					  
					  WebElement CONTACTMETHODS=driver.findElement(By.xpath(
					  "//button[@title='Add Contact Methods']" )); 
					  CONTACTMETHODS.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  
					  // Add CONTACT METHODS
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String CONTACTMETHODSMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(CONTACTMETHODSMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualCONTACTMETHODSMSG = "Contact Method Added Successfully!";
						  if(ActualCONTACTMETHODSMSG.equals(CONTACTMETHODSMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + CONTACTMETHODSMSG);
						    }
						        else {
						            System.out.println("Fail - CONTACT METHODS popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					 
					
					  // click on Add COMPANY TYPE button 
					  Thread.sleep(2000);
					  
					  WebElement COMPANY=driver.findElement(By.xpath(
					  "//button[@title='Add Company Type']" )); COMPANY.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  
					  // Add COMPANY TYPE
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String COMPANYMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(COMPANYMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualCOMPANYMSG = "Company Type Added Successfully!";
						  if(ActualCOMPANYMSG.equals(COMPANYMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + COMPANYMSG);
						    }
						        else {
						            System.out.println("Fail - Company Type popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
						  
					  // click on Add TIMEZONE button 
					  Thread.sleep(2000);
					  
					  WebElement TIMEZONE=driver.findElement(By.xpath(
					  "//button[@title='Add Time Zone']")); TIMEZONE.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  
					  // Add TIMEZONE
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String TIMEZONEMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(TIMEZONEMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualTIMEZONEMSG = "Time Zone Added Successfully!";
						  if(ActualTIMEZONEMSG.equals(TIMEZONEMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + TIMEZONEMSG);
						    }
						        else {
						            System.out.println("Fail - TIMEZONE popup message text is not matching");
						        }
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					  
					  
					  
					  // click on Add INTERVIEW LEVELS button 
					  Thread.sleep(2000);
					  
					  WebElement INTERVIEW=driver.findElement(By.xpath(
					  "//button[@title='Add Interview Levels']" )); INTERVIEW.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
					  
					  // Add EDUCATION CATEGORY 
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("Test Level");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String INTERVIEWMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(INTERVIEWMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualINTERVIEWMSG = "Interview Level Added Successfully!";
						  if(ActualINTERVIEWMSG.equals(INTERVIEWMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + INTERVIEWMSG);
						    }
						        else {
						            System.out.println("Fail - Interview Level popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					  
					  
					  
					  // click on Add INTERVIEW LEVEL STATUS button 
					  Thread.sleep(2000);
					  
					  WebElement INTERVIEWLEVELSTATUS=driver.findElement(By.xpath(
					  "//button[@title='Add Interview Level Status']" ));
					  INTERVIEWLEVELSTATUS.click(); driver.manage().timeouts().pageLoadTimeout(20,
					  TimeUnit.SECONDS);
					  
					  // Add INTERVIEW LEVEL
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String INTERVIEWLEVELSTATUSMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(INTERVIEWLEVELSTATUSMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualINTERVIEWLEVELSTATUSMSG = "Interview Level Status Added Successfully!";
						  if(ActualINTERVIEWLEVELSTATUSMSG.equals(INTERVIEWLEVELSTATUSMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + INTERVIEWLEVELSTATUSMSG);
						    }
						        else {
						            System.out.println("Fail - INTERVIEW LEVEL popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					 
					 
					
					
					  // click on Add CONTACT ACTIONS button 
					  Thread.sleep(2000);
					  
					  WebElement CONTACTACTIONS=driver.findElement(By.xpath(
					  "//button[@title='Add Contact Actions']"
					  )); CONTACTACTIONS.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
					  
					  // Add CONTACTACTIONS 
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String CONTACTACTIONSMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(CONTACTACTIONSMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualCONTACTACTIONSMSG = "Contact Action Added Successfully!";
						  if(ActualCONTACTACTIONSMSG.equals(CONTACTACTIONSMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + CONTACTACTIONSMSG);
						    }
						        else {
						            System.out.println("Fail - Position type popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					 
					
					  // click on Add NOTICE PERIOD DETAILS button 
					  Thread.sleep(2000);
					  
					  WebElement NOTICEPERIOD=driver.findElement(By.xpath(
					  "//button[@title='Add Notice Period']"
					  )); NOTICEPERIOD.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  
					   // Add NOTICEPERIOD
					  Thread.sleep(2000);
					   driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String NOTICEPERIODMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(NOTICEPERIODMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualNOTICEPERIODMSG = "Notice Period Added Successfully!";
						  if(ActualNOTICEPERIODMSG.equals(NOTICEPERIODMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + NOTICEPERIODMSG);
						    }
						        else {
						            System.out.println("Fail - Notice Period  popup message text is not matching");
						        }
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					 
					
					  // click on Add MODE OF INTERVIEWS button 
					  Thread.sleep(2000);
					  
					  WebElement  MODEOFINTERVIEWS=driver.findElement(By.xpath(
					  "//button[@title='Add Mode Of Interviews']"
					  )); MODEOFINTERVIEWS.click();
					  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					  
					   // Add MODE OF INTERVIEWS 
					  Thread.sleep(2000);
					   driver.findElement(By.xpath(
					  "//input[@placeholder='Add list']")).sendKeys("abcdf");
					  
					  // SAve it
					  driver.findElement(By.xpath("//*[@id=\"submitTo\"]/span[2]")).click();
					  
					  
					  String MODEOFINTERVIEWSMSG =
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(MODEOFINTERVIEWSMSG);

					  Thread.sleep(1000);			  
						 // assertEquals(ContactMSG,"Contact Type Added Successfully!");
						 String ActualMODEOFINTERVIEWSMSG = "Mode of Interview Added Successfully!";
						  if(ActualMODEOFINTERVIEWSMSG.equals(MODEOFINTERVIEWSMSG)){
						        System.out.println(" Pass - popup message text comparision is Matching" + MODEOFINTERVIEWSMSG);
						    }
						        else {
						            System.out.println("Fail - Mode of Interview popup message text is not matching");
						        }
					  
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/button")
					  ).click();
					 
					
					
					// Brower Close
					driver.close();

		
	}

}


