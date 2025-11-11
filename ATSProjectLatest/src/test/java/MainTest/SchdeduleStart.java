package MainTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class SchdeduleStart {
	
	WebDriver driver;
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		 driver = launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	
	 @Test
	    public void Schedule_Start() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@class='form-group homedashboardtxt']//a[normalize-space()='Candidate List']")).click();
			
			//Click on any Candidate
			Thread.sleep(3000);
			
			 String originalWindow = driver.getWindowHandle();
				System.out.println("mainwindow ="+originalWindow);
			 			 
				driver.findElement(By.linkText("Murali")).click();
				
				// Click on Schedule an interview icon
				driver.findElement(By.xpath("//button[@title='Schedule a Start']")).click();
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//button[@title='Search Jobs']")).click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				
				// Send ATS id to the field
				driver.findElement(By.xpath("//input[@id='atsRef']")).sendKeys("11");
				
				//Click on Search Button for Search Jobs screen
				driver.findElement(By.xpath("//button[@id='search']//span[contains(text(),'Search')]")).click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				
				// Select Final Bill Rate
				driver.findElement(By.xpath("//input[@id='schedules_final_bill_rate']")).clear();
				driver.findElement(By.xpath("//input[@id='schedules_final_bill_rate']")).sendKeys("500000");
						
				// Select Agreed Pay Rate
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='agreed_pay_rate_first']")).clear();
				driver.findElement(By.xpath("//input[@id='agreed_pay_rate_first']")).sendKeys("500000");
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				// SelectOn-Board Status
				driver.findElement(By.xpath("//label[normalize-space()='Select']")).click();
				driver.findElement(By.xpath("//li[normalize-space()='Select & on board']")).click();
				
				//Click on Create 'Schedule a Start' button
				driver.findElement(By.xpath("//span[normalize-space()='Create Schedule a Start']")).click();
				
				// Close the WebDriver
		        driver.quit();
	 }

}
