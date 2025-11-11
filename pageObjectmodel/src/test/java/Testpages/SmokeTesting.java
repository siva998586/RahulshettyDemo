package Testpages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import CRM.NewComapanyPage;
import CRM.NewContactPage;
import JobManagement.NewJob;
import Login.Loginpage;

public class SmokeTesting {
	
	public WebDriver driver;
	public Loginpage loginPage;
	public NewComapanyPage company;
	public NewContactPage Contact;
	public CRM.CRM_WebElements CRM_WEb;
	public Testpages.NewJobTest NewJobTst;
	public JobManagement.NewJob NewJob;

    @BeforeClass
    public void setUp() throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "D:\\SivaramData\\driver\\geckodriver.exe");
	    
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
		loginPage = new Loginpage(driver);
		company = new NewComapanyPage(driver);
		Contact = new NewContactPage(driver);
		CRM_WEb = new CRM.CRM_WebElements(driver);
		NewJobTst = new Testpages.NewJobTest(driver);
		NewJob = new NewJob(driver);
		
		
		// LaunchWebsite  
	    driver.get("http://192.168.1.96/#/login");  
	   
		
		 driver.manage().window().maximize(); 
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Thread.sleep(4000);
    }

    @Test(priority=0)
    public void EnterLoginCredetials() {
        loginPage.enterUsername("sivaramakrishna@trajectus.com");
        loginPage.enterPassword("Siva@123");
        loginPage.clickLoginButton();

        // Add assertions to verify login success or failure
        // For example: Assert.assertEquals(driver.getCurrentUrl(), "expected_url_after_login");
    }
    
    @Test(priority = 1)
    public void Navigate_NewCompanyLink() throws InterruptedException {
    	Thread.sleep(2000);
    	CRM_WEb.CRMLink();
    	Thread.sleep(1000);
		CRM_WEb.NewCompany_Link();
    } 
    
    @Test(priority = 2)
    public void EnterCompanyDetails() throws InterruptedException  {
    
    	Thread.sleep(2000);
    	company.EnterCompanyDetails();
    }
    
    @Test(priority = 3)
    public void Navigate_NewContactLink() throws InterruptedException {
    	Thread.sleep(2000);
    	CRM_WEb.CRMLink();
		CRM_WEb.NewContact_Link();
    } 
    
    
    @Test(priority = 4)
    public void EnterContactsDetails() throws InterruptedException  {
    
    	Thread.sleep(2000);
    	Contact.EnterContactDetails();
    }
    @Test(priority = 5)
    public void Create_NewJob() throws InterruptedException  {
        
    	Thread.sleep(2000);
   
    	NewJobTst.ClickonJMLink();
    	NewJobTst.ClickonNewJob();
    	Thread.sleep(2000);
    	NewJobTst.Enter_NewJobDetails();
    }
    
}