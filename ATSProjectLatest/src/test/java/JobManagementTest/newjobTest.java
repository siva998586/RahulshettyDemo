package JobManagementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class newjobTest {
		 WebDriver driver;
		 
		 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	
	@Test(priority=1)
	public void EnterNewJob() throws InterruptedException {
				Thread.sleep(2000);
			
		  driver.findElement(By.xpath("//a[normalize-space()='Job Management']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='New Job']")).click();
		
		  Thread.sleep(2000);
		  
				  
		  //Add Title field
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys("adfasdf Ringa");
													// Select Position Type
			driver.findElement(By.xpath("//label[normalize-space()='Select Position']")).click();
			
			driver.findElement(By.xpath("//li[normalize-space()='Contract']")).click();
			Thread.sleep(1000);
			//Select Division
			driver.findElement(By.xpath("//label[normalize-space()='Select Division']")).click();
			driver.findElement(By.xpath("(//li[normalize-space()='ATS India'])[1]")).click();
			Thread.sleep(1000);
			//Select Job Status
			driver.findElement(By.xpath("//label[normalize-space()='Select Status']")).click();
			driver.findElement(By.xpath("(//li[normalize-space()='Open'])[1]")).click();
			Thread.sleep(1000);
			//Select Contract
			driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/form/div/div[2]/div[1]/div[1]/div[2]/div/div/div[8]/div/label")).click();
			driver.findElement(By.xpath("//div[@id='contact']//li[@class='ui-dropdown-item ui-corner-all'][normalize-space()='Appanna A']")).click();
			Thread.sleep(1000);
			 //Select Company/Dep
			
													
			//Select State dropdown and select state
			driver.findElement(By.xpath("//*[@id=\"states\"]/label")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"states\"]/div[4]/div[2]/ul/li[2]")).click();
			Thread.sleep(1000);
			// Select Approver/Team Lead
			driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/form/div/div[2]/div[1]/div[1]/div[2]/div/div/div[23]/div/label")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[23]/div[1]/div[4]/div[2]/ul[1]/li[1]")).click();
			Thread.sleep(1000);
			// Select Primary recruiter
			driver.findElement(By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Choose']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[24]/div[1]/div[4]/div[2]/ul[1]/li[48]")).click();
			Thread.sleep(1000);
			// Select Recruiter
			driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[26]/div/div[2]/label")).click();
			driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[26]/div/div[4]/div[2]/ul/li[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"description\"]/div[2]/div[1]")).click();
			Thread.sleep(1000);
			//SAVE button
			
			driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
			
			
			Thread.sleep(1000);
			 String NewJobpopMsg =  driver.findElement(By.xpath("//div[@role='document']//div//p")). getText();
								  
					  System.out.println(NewJobpopMsg);
					  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
					  driver.findElement(By.xpath("//div[@role='document']//div//button[@type='button']")).click();
					  
					String UrlJobDashboard=  driver.getCurrentUrl();
				//	System.out.print(UrlJobDashboard);
			
				    if(UrlJobDashboard.contains("http://192.168.1.96/#/jobsDashboard"))
				    {
				        System.out.println("Landed in correct URL" +
				                "" + UrlJobDashboard);

				    }else
				    {
				        System.out.println("Landed in wrong URL");

				    }
					  
					  
				 // Close the browser
			        driver.quit();
					  
	    }
	

}
