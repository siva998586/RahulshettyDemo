package TalentManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class TalentSearch {

	WebDriver driver;
	 
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	
	@Test(priority=1)
	public void NavigateTOTalentSearchURL() throws InterruptedException {
				Thread.sleep(2000);
			
				  driver.get("http://192.168.1.96/#/talentSearch");
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	
				      }
	
	 @Test(priority=2)
	 public void Verify_Talent_search() throws InterruptedException {
	Thread.sleep(2000);
						
		// Enter Skills in the field and click on Search button
	driver.findElement(By.xpath("//input[@id='require0']")).sendKeys("java");
	driver.findElement(By.xpath("//tr[@id='require_skill_0']//input[@id='year0']")).sendKeys("3");

	driver.findElement(By.xpath("//button[@id='search']//span[contains(text(),'Search')]")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	String ExpectedTitle = "ATS Application - Agent Require Skill";
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	


	//driver.navigate().back(); 
	 // Close the browser
    driver.quit();
	  
	
	
	 }
	 
	
}
