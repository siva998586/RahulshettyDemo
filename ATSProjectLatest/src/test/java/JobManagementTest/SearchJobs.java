package JobManagementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class SearchJobs {
	
	WebDriver driver;
	 
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	
	@Test(priority=1)
	public void VerifysearchJobs() throws InterruptedException {
				Thread.sleep(2000);
			
				  driver.get("http://192.168.1.96/#/searchJobs");
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				    
				      }
	
	 @Test(priority=2)  
	 public void Verify_ATSID_search() throws InterruptedException {
						Thread.sleep(2000);
						
		// click on the ATD id link		
driver.findElement(By.xpath("//input[@placeholder='ATS ID#']")).sendKeys("11");
driver.findElement(By.xpath("//div[@class='col-lg-12 mt-3 mb-2']//span[contains(text(),'Search')]")).click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.navigate().back(); 
	
	 }
	 
	 @Test(priority=2)  
	 public void Verify_User_search() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
						
		// click on the ATD id link		
						driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/form/div/div[2]/div/div[2]/div/div[1]/div[13]/div/div[2]/div/label")).click();
						driver.findElement(By.xpath("//body//div[@id='root']//div[@id='accordionBasicInformation']//div//div//div//div//div//div//div//li[1]")).click();
						driver.findElement(By.xpath("//div[@class='col-lg-12 mt-3 mb-2']//span[contains(text(),'Search')]")).click();
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//driver.navigate().back(); 
						
						  
						 // Close the browser
					        driver.quit();
	
	 }
	

}
