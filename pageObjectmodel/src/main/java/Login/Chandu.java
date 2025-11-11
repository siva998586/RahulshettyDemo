
package Login;
 
import org.openqa.selenium.WebDriver;  

import org.openqa.selenium.firefox.FirefoxDriver;  
 
 
public class Chandu {  

	//public WebDriver driver;


public void launch() {  

	       // System Property for Chrome Driver   

	    	 System.setProperty("webdriver.gecko.driver", "D:\\SivaramData\\driver\\geckodriver.exe");

	        // Instantiate a ChromeDriver class.      

	    	WebDriver driver = new FirefoxDriver();

	    	driver.navigate().to("http://192.168.1.96/#/dashboard");

	        // Launch Website   


	    // Close the Browser  

	        driver.close();  


	    }  

}