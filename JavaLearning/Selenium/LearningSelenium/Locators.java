package LearningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
	//public static WebDriver driver;
	public WebDriver driver;

	
		
		  public void BrowserLaunch() {
		        System.setProperty("webdriver.gecko.driver", "D:\\SivaramData\\driver\\geckodriver.exe");
		       driver = new FirefoxDriver();
	}
		  
		  public static void main(String[] args) {
			  
		  }

}
