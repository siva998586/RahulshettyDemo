package JobManagementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class RecHiringReport {
	
		WebDriver driver;
		 
		 
		@Test(priority=0)
		public void BrowserLaunch() throws InterruptedException {
			ATSLoginTest launch = new ATSLoginTest();
			launch.BrowserLaunch();
			launch.EnterLoginCredentials();
		}
		
		@Test(priority=1)
		public void VerifyRECRUITERSREPORTtable() throws InterruptedException {
					Thread.sleep(2000);
				
					  driver.get("http://192.168.1.96/#/recruiterhiringReports");
					  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 /*
					  // Locate the div element
					   boolean divElement = driver.findElement(By.cssSelector("div[role='presentation'] div[role='row'] div:nth-child(1)")).isDisplayed();
					    
					    System.out.println(divElement);
					  
					  
					    

					          // Assuming your AG Grid has a unique identifier or class
					          String agGridSelector = "ag-body-viewport ag-layout-normal";

					          // Wait for the AG Grid to be visible
					          WebElement agGrid = driver.findElement(By.xpath("//div[@ref='eBodyViewport']"));

					          // Perform your verification actions
					          // For example, you can check the number of rows or specific cell values
					          int numRows = agGrid.findElements(By.cssSelector(".ag-center-cols-container .ag-row")).size();
					          System.out.println("Number of rows in AG Grid: " + numRows);

					          // Close the WebDriver
					          driver.quit();
					          
					          */
					    
					    
					  
						 // Close the browser
					       driver.quit();
					    
					    
					    
					    
					      }
					  }
