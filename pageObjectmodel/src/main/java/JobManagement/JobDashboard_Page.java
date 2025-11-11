package JobManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JobDashboard_Page {
	
	 private WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Job Management')]")
	WebElement JobManagement;
	
	@FindBy(xpath="//a[normalize-space()='61']")
	WebElement ATSIDlink;	
	
	@FindBy(xpath="(//a[normalize-space()='56'])[1]")
	WebElement ClientIDlink;
	
	@FindBy(xpath="//a[normalize-space()='Krishna Chinni Krishna']")
	WebElement CandidateLink;
	
	

	public JobDashboard_Page() {
		// TODO Auto-generated constructor stub
		
		//JobManagement link click
		JobManagement.click(); 
	}
	
	public void JDPageTitleverify() {
		String Actualpagetitle = "ATS Application - Jobs Dashboard​";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,Actualpagetitle);
		}
			
	
	public void JD_ATSIDlink() {
		ATSIDlink.click();
		
		String ATSURL = "http://192.168.1.96/#/jobProfile/62​";
		String expectedATSUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedATSUrl,ATSURL);
				
	}
	
	public void JD_ClientIDlink() {
		ClientIDlink.click();
		
		String ATSURL = "http://192.168.1.96/#/jobProfile/62​";
		String expectedATSUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedATSUrl,ATSURL);
		
	}
	
	public void JD_CandidateLink() {
		CandidateLink.click();
		
		String CandidateUrl = "http://192.168.1.96/#/viewCandidateReal/76​";
		String expectedCandidateUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedCandidateUrl,CandidateUrl);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
