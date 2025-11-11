package LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ATSLogin_Page {
public  WebDriver driver;
	
	public By username = By.xpath("//*[@id=\"email\"]");
	public By password = By.xpath("//*[@id=\"password\"]");
	public By login = By.xpath("//*[@id=\"loginBtn\"]/span[2]");
    
    public ATSLogin_Page(WebDriver driver) {
    this.driver = driver;
    }
    
    public void enterUsername(String UN) {
    	driver.findElement(username).sendKeys(UN);
        }

    public void enterPassword(String PWD) {
        driver.findElement(password).sendKeys(PWD);
    }

    public void clickLoginButton() {
        driver.findElement(login).click();
    }
    
}
   