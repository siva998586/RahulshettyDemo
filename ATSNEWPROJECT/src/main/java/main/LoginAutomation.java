package main;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
	public class LoginAutomation {
	@Test
	public void login() {
	System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\FireFoxDriver\\geckodriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/users/sign_in");

	}
	}
