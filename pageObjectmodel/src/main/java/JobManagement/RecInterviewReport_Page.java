package JobManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RecInterviewReport_Page {
	
	private WebDriver driver;
	
	@FindBy(xpath="//body//div[@id='root']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[1]//div[3]//span[1]//a[1]")
	WebElement RecInterviewReport;
	
	@FindBy(xpath="//*[@id=\"grid-height\"]/div[1]/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[3]/span/a")
	WebElement CandidateLink;
	
	@FindBy(xpath="//button[@id='btnDownloadCSV']//span[1]")
	WebElement DownloadCSV;
	

	public RecInterviewReport_Page() {
		// TODO Auto-generated constructor stub
				
		RecInterviewReport.click();
	}
	
	public void RecIntURLverify() {
		String RecIntReport = "http://192.168.1.96/#/recruiterinterviewReports";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,RecIntReport);
		}
	
	public void RIR_CandidateLink() {
		CandidateLink.click();
		
		String CandidateUrl = "http://192.168.1.96/#/viewCandidateReal/76​";
		String expectedCandidateUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedCandidateUrl,CandidateUrl);
		
	}
	public void DownloadCSV() {
		// TODO Auto-generated constructor stub
		DownloadCSV.click();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
