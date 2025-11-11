package MainTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class Activity_Submission {

	
	WebDriver driver;
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		 driver = launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}

		@Test(priority=1)
		public void Act_Submission() throws InterruptedException {
			Thread.sleep(3000);
			 driver.findElement(By.xpath("//div[@class='form-group homedashboardtxt']//a[normalize-space()='Candidate List']")).click();
				
				//Click on any Candidate
				Thread.sleep(3000);
				
				 String originalWindow = driver.getWindowHandle();
					System.out.println("mainwindow ="+originalWindow);
				 			 
					driver.findElement(By.linkText("Murali")).click();
							
								
								
								// Click on Submit Activity icon
									driver.findElement(By.xpath("//button[@title='Submit Activities']")).click();
									// Click on Search button
									driver.findElement(By.xpath("//button[@title='More Search Options']")).click();
									
									//Click on Search Button for Search Jobs screen
									driver.findElement(By.xpath("//button[@id='search']//span[contains(text(),'Search')]")).click();
									Thread.sleep(1000);
					
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
								
}
}