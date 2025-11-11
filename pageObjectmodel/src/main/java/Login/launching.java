package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class launching {
	public WebDriver driver;
	// Adding Method
	
	 
	
	@BeforeMethod
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\FireFoxDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void EnterCredentials() throws InterruptedException {
		
		driver.wait(2000);
		//Enter UserName and as students
		driver.findElement(By.id("username")).sendKeys("student");
		
	}

	
	
}
