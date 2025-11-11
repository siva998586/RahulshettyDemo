package Testpages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Execution {
	WebDriver driver;
	
	@Test(priority =0)
	public void launch() throws InterruptedException {
		BrowserLaunch.();
	}
	
	@Test(priority =1)
	public void ATSLogin() {
		
		

}
}
