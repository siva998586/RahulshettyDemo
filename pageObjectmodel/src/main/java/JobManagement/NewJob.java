package JobManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewJob {

	WebDriver driver;
	
	public NewJob(WebDriver driver) {
	   this.driver = driver;
	 } 
	
	public void NewJobDeatials() {

		
		  //Add Title field
			By job_title = By.xpath("//input[@id='title']");
			
			driver.findElement(job_title).sendKeys("JobAt");
					
		 //position Type Field Click
			Select positionType = new Select(driver.findElement(By.xpath("//label[normalize-space()='Select Position']")));
			positionType.selectByVisibleText("Direct Resource");
			
			//Experience Field 
			Select Experience = new Select(driver.findElement(By.xpath("//label[normalize-space()='Select Experience']")));
			Experience.selectByVisibleText("5 years");
			
			
			//Add ClientID field
			By ClientID = By.xpath("//input[@id='clientJobID']");
			driver.findElement(ClientID).sendKeys("12345AT");
			
			//Division Field 
			Select Division = new Select(driver.findElement(By.xpath("//label[normalize-space()='Select Division']")));
			Division.selectByVisibleText("5 years");
			
			//Job Status Field 
			Select JobStatus = new Select(driver.findElement(By.xpath("//label[normalize-space()='Select Status']")));
			JobStatus.selectByVisibleText("Open");
			
			//Job Status Field 
			Select JobPriority = new Select(driver.findElement(By.xpath("//label[normalize-space()='Select Job Priority']")));
			JobPriority.selectByVisibleText("Hot");
			
			
			//Job Status Field 
			Select Contact = new Select(driver.findElement(By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Contact']")));
			Contact.selectByVisibleText("Abcde de");
			
			
			// Enter Bill Rate , Pay Rate and Period
			By Bill = By.xpath("//input[@id='billRateFrom']");		driver.findElement(Bill).sendKeys("2500000");
			By Rate = By.xpath("//input[@id='billRateTo']");		driver.findElement(Rate).sendKeys("4500000");
			By Pay = By.xpath("//input[@id='payRateFrom']");		driver.findElement(Pay).sendKeys("2000000");
			By PRate = By.xpath("//input[@id='payRateTo']");		driver.findElement(PRate).sendKeys("3000000");
			
			
			
			
			//Select period 
			Select period = new Select(driver.findElement(By.xpath("//label[normalize-space()='Select']")));
			period.selectByVisibleText("Per Month");
			
			
			//Select Approver or Team lead 
			Select Approver = new Select(driver.findElement(By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Approver/Team Lead']")));
			Approver.selectByVisibleText("Abacus Admin");
			
			//Select Primary Recruiter 
			Select PrimaryRecruiter = new Select(driver.findElement(By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Choose']")));
			PrimaryRecruiter.selectByVisibleText("Abacus Admin");
			
			//Select Recruiter 
			Select Recruiter = new Select(driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[25]/div/div[2]/label")));
			Recruiter.selectByVisibleText("sivaramakrishna Ch");
			Recruiter.selectByIndex(2);
			
			
			// Click on SAVE button
			
			/* driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
			
			
			
			
			
			
			
			
			
			
			
			Thread.sleep(1000);
			 String NewJobpopMsg =
					  driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/p")).
					  getText();
					  
					  System.out.println(NewJobpopMsg);
					  
					  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
					  driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/button")
					  ).click();
			
		  
}



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LaunchATSBrowserpage browserlaunch = new LaunchATSBrowserpage();
		browserlaunch.Launchbrowser();
		
		NewJob newjob = new NewJob();
		newjob.NewJobscreen();
		
		*/
		
	}

}
