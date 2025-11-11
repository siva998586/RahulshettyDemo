package Admin;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import LaunchBrowserTest.ATSLoginTest;

public class RoleAdministrator {
    WebDriver driver;
    public RoleAdministratorPage RoleAdmin; // Initialize the RoleAdmin object

    @BeforeMethod
    public WebDriver setUp() throws InterruptedException {
    	 ATSLoginTest launch = new ATSLoginTest();
    	    driver = launch.BrowserLaunch();
    	    launch.EnterLoginCredentials();
    	       return driver;
      
    }

    @Test
    public void Select_AddRole_Button() throws InterruptedException {
    	// Initialize the RoleAdmin object here
		/*
		 * RoleAdministratorPage roleAdminPage = new RoleAdministratorPage(driver);
		 * WebElement roleAdminLink = roleAdminPage.getRoleAdminLink();
		 * roleAdminLink.click();
		 */
    	
    	  WebElement adminLink = driver.findElement(By.className("nav-link"));
          Actions actions = new Actions(driver);

          // Hover over the Admin link to open the submenu
          actions.moveToElement(adminLink).perform();
          driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

          // Find the Role Administration link
          WebElement roleAdminLink = driver.findElement(By.linkText("Role Administration"));

          // Use JavascriptExecutor to scroll the element into view
          ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", roleAdminLink);

          // Click the Role Administration link
          roleAdminLink.click();
          
			// Click the Add Role
          WebElement AddRole_Button = driver.findElement(By.xpath("//button[@title='Add Role']"));
          Actions act = new Actions(driver);
          act.moveToElement(AddRole_Button).perform();
          driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
          AddRole_Button.click();
          
    	
    }
}
