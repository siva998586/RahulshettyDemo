package Admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class TestDemo {

	public WebDriver driver;
		 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		launch.BrowserLaunch();
		launch.EnterLoginCredentials();
	}
	
	@Test(priority=1)
	public void IdentifyDivElements() throws InterruptedException, IOException {
		Thread.sleep(3000);
		
		 String originalWindow = driver.getWindowHandle();
			System.out.println("mainwindow ="+originalWindow);
		 
			driver.findElement(By.className("img-user-option")).click();

			//Get the list of window handles
			
			List<String> tabs=new ArrayList<String>(driver. getWindowHandles()) ;
			
			System.out.println(tabs.size());
			//Use the list of window handles to switch between windows
				driver.switchTo().window(tabs.get(1));
				System.out.println("Tab1 - " +tabs.get(0));
				
		 Thread.sleep(2000);
		 WebElement menu = driver.findElement(By.tagName("//a[@aria-haspopup='true']"));

         // Click on the menu to open it
         menu.click();

         // Locate and click the "Profile" option within the menu
         WebElement profileOption = menu.findElement(By.xpath("//span[text()='Profile']"));
         profileOption.click();
	
	}
		

	}
