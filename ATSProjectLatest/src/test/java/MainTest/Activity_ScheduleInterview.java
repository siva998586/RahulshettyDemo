package MainTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class Activity_ScheduleInterview {
	
	WebDriver driver;
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		 driver = launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	
	 @Test
	    public void ScheduleInterview() throws InterruptedException {
	
		 
		 driver.findElement(By.xpath("//div[@class='form-group homedashboardtxt']//a[normalize-space()='Candidate List']")).click();
			
			//Click on any Candidate
			Thread.sleep(3000);
			

			 String originalWindow = driver.getWindowHandle();
				System.out.println("mainwindow ="+originalWindow);
			 
			 
				driver.findElement(By.linkText("Murali")).click();
				
				// Click on Schedule an interview icon
				driver.findElement(By.xpath("//button[@title='Schedule an Interview']")).click();
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//button[@title='More Search Options']//span[contains(text(),'Search')]")).click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				
				// Send ATS id to the field
				driver.findElement(By.xpath("//input[@id='atsRef']")).sendKeys("11");
				
				//Click on Search Button for Search Jobs screen
				driver.findElement(By.xpath("//button[@id='search']")).click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				
				// Select Interview Level from doropdown
				driver.findElement(By.xpath("//div[@id='interview_level_id']//label")).click();
				driver.findElement(By.xpath("//div[@id='interview_level_id']//li[1]")).click();
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				// Select Interview Level Status
				driver.findElement(By.xpath("//div[@id='interview_level_status_id']//label")).click();
				driver.findElement(By.xpath("//div[@id='interview_level_status_id']//li[1]")).click();
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				// Select Mode of Interview
				driver.findElement(By.xpath("//div[@id='interview_mode']//label")).click();
				driver.findElement(By.xpath("//div[@id='interview_mode']//li[1]")).click();
				
				//Click on Create Intervieww button
				driver.findElement(By.xpath("//span[normalize-space()='Create Interview']")).click();
				
				// Close the WebDriver
		        driver.quit();
				
			

	 }
}
