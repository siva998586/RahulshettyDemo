package TalentManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class NewCandidate_withoutResume {
	
	WebDriver driver;
	 
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	
	@Test(priority=1)
	public void navigatetoNewcandidatescreen() throws InterruptedException {
				
			
				//   driver.get("http://192.168.1.96/#/candidate");
				 driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div[3]/div/a")).click();
				    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 Thread.sleep(5000);
				    
	    }
			  
	 @Test(priority=2)  
	 public void EnterDetails_CandidateWithoutResume() throws InterruptedException
	 {
	
		// Enter Mandatory Information of the Candidate
		
		 // Enter Email of the candidate
	 driver.findElement(By.xpath("//input[@placeholder='example@mail.com']")).sendKeys("Bhaya@mailinator.com");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 // Enter First Name
	 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Bhagya");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 // Enter Last Name 
	 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("P");
	 
		//Select State dropdown and select state
		driver.findElement(By.xpath("//*[@id=\"states\"]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"states\"]/div[4]/div[2]/ul/li[2]")).click();
		
		
		// select resume source
		driver.findElement(By.xpath("//div[@id='resumeSource']//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Select Resume Source']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='resumeSource']//li[@class='ui-dropdown-item ui-corner-all'][normalize-space()='Monster']")).click();
		
		
		// Click on SAVE button
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		
		Thread.sleep(1000);
		 String saveCandidatePopup =  driver.findElement(By.xpath("//div[@role='document']//div//p")). getText();
							  
				  System.out.println(saveCandidatePopup);
				  
				  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				  
				  //click on ok button on the popup message
				  driver.findElement(By.xpath("//div[@role='document']//div//button[@type='button']")).click();
				  
				String URL_CandidateList=  driver.getCurrentUrl();
			//	System.out.print(UrlJobDashboard);
		
			    if(URL_CandidateList.contains("http://192.168.1.96/#/resumesList"))
			    {
			        System.out.println("Landed in correct URL" +
			                "" + URL_CandidateList);

			    }else
			    {
			        System.out.println("Failed..:"+"Candidate Profile(Email) already exists!");

			    }
				  
		
	// Close the browser
    driver.quit();
				 
	
	 }
	 
	


}
