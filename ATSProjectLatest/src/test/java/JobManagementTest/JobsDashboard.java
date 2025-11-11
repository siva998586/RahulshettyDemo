package JobManagementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class JobsDashboard {
	
	WebDriver driver;
	 
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	@Test(priority=1)
	public void VerifyMyJobRecords() throws InterruptedException {
				Thread.sleep(2000);
			
				  driver.get("http://192.168.1.96/#/jobsDashboard");
	}
				
/*
				  // Locate the div element
				   boolean divElement = driver.findElement(By.xpath("(//div[@ref='eBodyContainer'])[1]")).isDisplayed();
				    
				    System.out.println(divElement);
				    
				// Assuming your AG Grid has a unique identifier or class
		          String agGridSelector = "ag-body-viewport ag-layout-normal";

		          // Wait for the AG Grid to be visible
		          WebElement agGrid = driver.findElement(By.xpath("//div[@ref='eBodyViewport']"));

		          // Perform your verification actions
		          // For example, you can check the number of rows or specific cell values
		          int numRows = agGrid.findElements(By.cssSelector("body div[id='root'] div[role='presentation'] div[role='presentation'] div[role='presentation'] div[role='presentation'] div:nth-child(1) div:nth-child(1)")).size();
		          System.out.println("Number of rows in AG Grid: " + numRows);

		          // Close the WebDriver
		          driver.quit();
		      }*/
				  
				  
	 @Test(priority=2)  
	 public void VerifyMyJob_ATSID() throws InterruptedException {
						Thread.sleep(2000);
						
		// click on the ATD id link		
	WebElement  atsid_link = driver.findElement(By.xpath("//a[normalize-space()='91']"));
	atsid_link.click();
	driver.navigate().back();  
				  
	
	 }
	 
	 
	 @Test(priority=3)  
	 public void VerifyMyJob_ClientID() throws InterruptedException {
						Thread.sleep(2000);
						
		// click on the ATD id link		
	WebElement  atsClient_link = driver.findElement(By.xpath("//a[normalize-space()='8021']"));
	atsClient_link.click();
	driver.navigate().back();  
			  
	}		
	 
	 
	 @Test(priority=4)  
	 public void VerifyMyJob_Title() throws InterruptedException {
						Thread.sleep(2000);
						
		// click on the ATD id link		
	WebElement  atsTitle_link = driver.findElement(By.xpath("//a[normalize-space()='Airtel']"));
	atsTitle_link.click();
	driver.navigate().back();  
	
	  
		 // Close the browser
	       driver.quit();
			  
	}	
	
	 
	
	}

