package JobManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class MyJobPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='nav-link active']")
	WebElement MyJobLink;
	
	@FindBy(xpath="//*[@id=\"grid-height\"]/div[1]/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[3]")
	WebElement JobTitleLink;
	
	@FindBy(xpath="//*[@id=\"accordionCollapseActivites\"]/div/div/div/div/table/tbody/tr[1]/td[1]/span")
	WebElement JP_CandidateLink;
	
	@FindBy(xpath="//*[@id=\"accordionCollapseActivites\"]/div/div/div/div/table/tbody/tr[1]/td[2]/span")
	WebElement JP_SubmitLink;

	@FindBy(xpath="//*[@id=\"accordionCollapseActivites\"]/div/div/div/div/table/tbody/tr[1]/td[3]/span")
	WebElement JP_Interview_SetLink;
	
	@FindBy(xpath="//*[@id=\"accordionCollapseActivites\"]/div/div/div/div/table/tbody/tr[14]/td[4]/span")
	WebElement JP_Start_SetLink;
	
	
	@FindBy(xpath="//*[@id=\"accordionCollapseActivites\"]/div/div/div/div/table/tbody/tr[1]/td[8]/span")
	WebElement JP_InternalNoteLink;
	
	public MyJobPage() {
		// TODO Auto-generated constructor stub
		
			PageFactory.initElements(driver, this);
	}
			
			public String verifyTitle() {
				return driver.getTitle();
			}
			
			public String verifyURL() {
				return driver.getCurrentUrl();
			}
			
			public String JobTitleLink() {
				JobTitleLink.click();
				return null;
			}
			
			
			
			

}