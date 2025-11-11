package JobManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JobSubmissionReport_page {
	
	private WebDriver driver;
		
		@FindBy(xpath="//a[normalize-space()='Job Submissions Report']")
		WebElement JobSubmissionReport;
		
		
		@FindBy(xpath="//span[normalize-space()='Download CSV']")
		WebElement DownloadCSV;
		
		

	public JobSubmissionReport_page() {
		// TODO Auto-generated constructor stub
		JobSubmissionReport.click();
	}
	
	public void JOBSubReportURLverify() {
		String JOBSubReport = "http://192.168.1.96/#/jobsubmissions";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,JOBSubReport);
		}
	public void DownloadCSV() {
		// TODO Auto-generated constructor stub
		DownloadCSV.click();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
