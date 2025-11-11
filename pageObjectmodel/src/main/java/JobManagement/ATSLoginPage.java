package JobManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ATSLoginPage {


public WebDriver driver;

By username = By.xpath("//input[@type='email']");
By pwd = By.xpath("//input[@type='password']");
By login = By.xpath("//button[@type='loginBtn']");
By profile = By.xpath("//li[contains(@class,'nav-item dropdown user-menu')]/a[1]/img");
By logout = By.xpath("//li[@class='user-footer']/a[1]");
 

public ATSLoginPage(WebDriver driver) {
    
    this.driver = driver;
 }

public static void  Login_UserName(WebDriver driver)
{
	driver.findElement(By.id("username")).sendKeys("sivaramakrishna@trajectus.com");
}

public static void  Login_UserPwd(WebDriver driver)
{
	driver.findElement(By.id("pwd"));
	
}

public static void  Login_Button(WebDriver driver)
{
	driver.findElement(By.id("login"));
	
}

}

