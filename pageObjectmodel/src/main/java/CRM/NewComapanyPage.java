package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NewComapanyPage {
	
public  WebDriver driver;
	
	public By Company_Name = By.xpath("//input[@id='company_name']");
	public By StateClick = By.xpath("//label[normalize-space()='Select State']");
	public By SelectState = By.xpath("//li[normalize-space()='AP - Andhra Pradesh']");
	public By SAVE = By.xpath("//span[normalize-space()='Save']");
	public By popupOK = By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/button");
    
    public NewComapanyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
	  }
    
    public void EnterCompanyDetails() throws InterruptedException {
    	driver.findElement(Company_Name).sendKeys("GrAPHICSAC");
    	Thread.sleep(4000);
    	driver.findElement(StateClick).click();
    	
    	driver.findElement(SelectState).click();
    	driver.findElement(SAVE).click();
    	
    	//Popup message handle - get popup text 
		 Thread.sleep(2000);
		 String AddCompupMsg = driver.findElement(popupOK).getText();
				  
				  System.out.println("Company details added success - " + AddCompupMsg);
				  
				  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
				  
    	driver.findElement(popupOK).click();
    	System.out.println("Click " + AddCompupMsg + " pop up Button");
    	
    }
}
