package JobManagementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;
import LoginPage.ATSLogin_Page;

public class MyJobsTest {
	WebDriver driver;
	 public ATSLogin_Page LoginPage;
	 
	 
	@BeforeMethod
	public void BrowserLaunch() throws InterruptedException {
		
		  ATSLoginTest launch = new ATSLoginTest(); 
		  launch.BrowserLaunch();
		  launch.EnterLoginCredentials();
		
	}
	@Test(priority = 1)
    public void VerifyMyJobRecords() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("http://192.168.1.96/#/jobdetails");
        // Add your verification steps for MyJobRecords
    }

    @Test(priority = 2)
    public void VerifyMyJobTitle() throws InterruptedException {
        Thread.sleep(2000);
        // Click on the ATS title link
        WebElement atsTitleLink = driver.findElement(By.xpath("//div[5]//div[3]//span[1]//a[1]"));
        atsTitleLink.click();
        // Add your verification steps for MyJobTitle
      //driver.navigate().back();  
  	
			  
	}	
	
	 

}
