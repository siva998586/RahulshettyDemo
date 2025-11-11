package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CRM_WebElements {
	
	
		
		public  WebDriver driver;
			
			public By CRMLink = By.xpath("//a[normalize-space()='CRM']");
			public By MyContacts_Link = By.xpath("//a[normalize-space()='My Contacts']");
			public By SearchContacts_Link = By.xpath("//a[normalize-space()='Search Contacts']");
			public By NewContact_Link = By.xpath("//a[@class='nav-link'][normalize-space()='New Contact']");
			public By ComapnyList_Link = By.xpath("//a[normalize-space()='Company List']");
			public By SearchCompany_Link = By.xpath("//a[normalize-space()='Search Companies']");
			public By NewCompany_Link = By.xpath("//a[@class='nav-link'][normalize-space()='New Company']");
			public By ContactHotList_Link = By.xpath("//a[normalize-space()='Contact Hotlist']");
			
		    
		    
		    public CRM_WebElements(WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
			  }
		    
		    
		    public void CRMLink() {
		    	driver.findElement(CRMLink).click();
		    }
		    
		    public void MyContacts_Link() {
		    	driver.findElement(MyContacts_Link).click();
		    }
		    
		    public void SearchContacts_Link() {
		    	driver.findElement(SearchContacts_Link).click();}
		    
		    public void NewContact_Link() {
		    	driver.findElement(NewContact_Link).click();}
		    
		    public void ComapnyList_Link() {
		    	driver.findElement(ComapnyList_Link).click();}
		    
		    public void SearchCompany_Link() {
		    	driver.findElement(SearchCompany_Link).click();}
		    
		    public void NewCompany_Link() {
		    	driver.findElement(NewCompany_Link).click();}
		    
		    public void ContactHotList_Link() {
		    	driver.findElement(ContactHotList_Link).click();}
		    	
		    
		}

