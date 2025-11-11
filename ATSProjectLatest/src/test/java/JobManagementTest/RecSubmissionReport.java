package JobManagementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class RecSubmissionReport {
	
	WebDriver driver;
	 
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	
	@Test(priority=1)
	public void VerifyRECSubmissionReport() throws InterruptedException {
				Thread.sleep(2000);
			
				  driver.get("http://192.168.1.96/#/recruiterReports");
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				    
				      }
	
	 @Test(priority=2)  
	 public void VerifyMyJob_Title() throws InterruptedException {
						Thread.sleep(2000);
						
		// click on the ATD id link		
	WebElement  atsID_link = driver.findElement(By.linkText("91"));
	atsID_link.click();
	//driver.navigate().back(); 
	
	 }
	

}
