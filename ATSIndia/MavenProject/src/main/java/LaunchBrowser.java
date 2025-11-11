import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	 WebDriver driver ; 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SivaramData\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.get("http://192.168.1.96/#/login");

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
      driver.findElement(By.id("email")).sendKeys("sivaramakrishna@trajectus.com");
      driver.findElement(By.name("password")).sendKeys("Siva@123");
      Thread.sleep(5000);
     driver.findElement(By.id("loginBtn")).click();
      
      //driver.findElement(By.xpath("//*[@id='loginBtn']")).click();
      
     //driver.findElement(By.id("forget-password")).click();
    // driver.findElement(By.id("emailOrPhone")).sendKeys("chandu@trajectus.com");
     
    // Thread.sleep(5000);
	//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/div[2]/button[2]/span[2]")).click();
	//Thread.sleep(6000);
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]")).click();
	//Thread.sleep(6000);
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div[3]/span")).click();
	//Thread.sleep(6000);
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div[4]/div[1]/input")).sendKeys("All Jobs");
	//Thread.sleep(6000);
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div[4]/div[2]/ul/li")).click();
	//Thread.sleep(6000);
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[2]")).click();
	//Thread.sleep(6000);
	//driver.findElement(By.xpath("//*[@id=\"eName\"]")).click();
    Thread.sleep(6000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/div/div[3]")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("hello");
	Thread.sleep(6000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/form/div/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/label")).sendKeys("Direct Resource");
	}

}
