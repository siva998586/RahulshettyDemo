package Testpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import JobManagement.ATSLoginPage;

public class BrowserLaunch {
	WebDriver driver;
	
	 
	public void Browser()throws InterruptedException {
	//public static void main(String args[]) throws InterruptedException {
		 
System.setProperty("webdriver.gecko.driver", "D:\\SivaramData\\driver\\geckodriver.exe");
	    
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		// LaunchWebsite  
	    driver.navigate().to("http://192.168.1.96/#/login");  
	   
		
		 driver.manage().window().maximize(); 
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Thread.sleep(5000);
		 
		/* String title = driver.getTitle();
		 String ExdTitle = "ATS Application";
			
		 Assert.assertEquals("ATS Application", title, ExdTitle);	
		 System.out.println(title); */
	}
	
	
	public void login() {
		login();
	}

}
