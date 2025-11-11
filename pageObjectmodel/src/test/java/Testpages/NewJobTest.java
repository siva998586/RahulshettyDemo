package Testpages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import JobManagement.JM_WebElements;
import JobManagement.NewJob;


public class NewJobTest extends JM_WebElements {
	
	
	public  WebDriver driver;
	
	public JobManagement.NewJob NewJob;
	
	public NewJobTest(WebDriver driver) {
	   this.driver = driver;
	   NewJob = new NewJob(driver);
	 }
	
   
	 public void ClickonJMLink() {
		 driver.findElement(JM_Link).click();
		     }

	 public void ClickonNewJob() {
		 driver.findElement(NewJob_Link).click();
		     }
	 
	 public void Enter_NewJobDetails() {
		 NewJob.NewJobDeatials();
		 
		     }

}
