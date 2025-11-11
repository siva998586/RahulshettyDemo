package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewContactPage {
	
public  WebDriver driver;
	
	
	public By CompanyLink = By.xpath("//a[normalize-space()='New Contact']");
	public By Contact_Fname = By.xpath("//input[@id='first_name']");
	public By Contact_Lname = By.xpath("//input[@id='last_name']");
	public By ContactTypeClick = By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Contact Types']");
	public By SelectContactType = By.xpath("//li[normalize-space()='Business Analyst']");
	public By companyClick  = By.xpath("//label[normalize-space()='Select Company']");
	public By CompanySelet = By.xpath("//li[normalize-space()='Adidas']");
	private By popupok = By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/button");
	
	public By SAVE = By.xpath("//button[@id='submit']");
    
    
    public NewContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
	  }
    
    
    public void EnterContactDetails() throws InterruptedException {
    	Thread.sleep(1000);
    	driver.findElement(Contact_Fname).sendKeys("Abcdef");
    	driver.findElement(Contact_Lname).sendKeys("def");
    	driver.findElement(ContactTypeClick).click();
    	driver.findElement(SelectContactType).click();
    	Thread.sleep(1000);
    	driver.findElement(companyClick).click();
    	driver.findElement(CompanySelet).click();
    	Thread.sleep(1000);
    	driver.findElement(SAVE).click();
    	//driver.findElement(SAVE).click();
    	
    	
    	//Popup message handle - get popup text 
		 Thread.sleep(2000);
		 String AddCompupMsg =driver.findElement(popupok).getText();
				  
				  System.out.println("Contact details added success - " + AddCompupMsg);
				  
				  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
				  
				     	
   	driver.findElement(popupok).click();
   	System.out.println("Click " + AddCompupMsg + " pop up Button");
    	
    	
    	
    }


}
