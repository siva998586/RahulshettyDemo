package JobManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class NewJob_Page {
	public  WebDriver driver;
	
	
	/* public NewJobPage(WebDriver driver) {
		 this.driver = driver;
	}*/
		
		
		
	public void EnterNewJob() throws InterruptedException {
		Thread.sleep(2000);
		
	  driver.findElement(By.xpath("//a[normalize-space()='Job Management']")).click();
	  driver.findElement(By.xpath("//a[normalize-space()='New Job']")).click();
	
	  Thread.sleep(2000);
	  
	
	  
	  //Add Title field
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Ringa Ringa");
												// Select Position Type
		driver.findElement(By.xpath("//label[normalize-space()='Select Position']")).click();
		
		driver.findElement(By.xpath("//li[normalize-space()='Contract']")).click();
		Thread.sleep(1000);
		//Select Division
		driver.findElement(By.xpath("//label[normalize-space()='Select Division']")).click();
		driver.findElement(By.xpath("(//li[normalize-space()='ATS India'])[1]")).click();
		Thread.sleep(1000);
		//Select Job Status
		driver.findElement(By.xpath("//label[normalize-space()='Select Status']")).click();
		driver.findElement(By.xpath("(//li[normalize-space()='Open'])[1]")).click();
		Thread.sleep(1000);
		//Select Contract
		driver.findElement(By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Contact']")).click();
		driver.findElement(By.xpath("//div[@id='contact']//li[@class='ui-dropdown-item ui-corner-all'][normalize-space()='Ananya anu']")).click();
		Thread.sleep(1000);
		 //Select Company/Dep
		
												
		//Select State dropdown and select state
		driver.findElement(By.xpath("//*[@id=\"states\"]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"states\"]/div[4]/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		// Select Approver/Team Lead
		driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[24]/div/label")).click();
		driver.findElement(By.xpath("(//li[contains(text(),'Abacus Admin')])[1]")).click();
		Thread.sleep(1000);
		// Select Primary recruiter
		driver.findElement(By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Choose']")).click();
		driver.findElement(By.xpath("(//li[contains(text(),'Sivaramakrishna Chintala')])[2]")).click();
		Thread.sleep(1000);
		// Select Recruiter
		driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[26]/div/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[26]/div/div[4]/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"description\"]/div[2]/div[1]")).click();
		Thread.sleep(1000);
		//SAVE button
		
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		
		
		Thread.sleep(1000);
		 String NewJobpopMsg =  driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/p")).
				  getText();
				  
				  System.out.println(NewJobpopMsg);
				  
				  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
				  driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/button")
				  ).click();
				//Select Job Status
					driver.findElement(By.xpath("//label[normalize-space()='Select Status']")).click();
					driver.findElement(By.xpath("(//li[normalize-space()='Open'])[1]")).click();
					Thread.sleep(1000);
					//Select Contract
					driver.findElement(By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Contact']")).click();
					driver.findElement(By.xpath("//div[@id='contact']//li[@class='ui-dropdown-item ui-corner-all'][normalize-space()='Ananya anu']")).click();
					Thread.sleep(1000);
					 //Select Company/Dep
					
															
					//Select State dropdown and select state
					driver.findElement(By.xpath("//*[@id=\"states\"]/label")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"states\"]/div[4]/div[2]/ul/li[2]")).click();
					Thread.sleep(1000);
					// Select Approver/Team Lead
					driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[24]/div/label")).click();
					driver.findElement(By.xpath("(//li[contains(text(),'Abacus Admin')])[1]")).click();
					Thread.sleep(1000);
					// Select Primary recruiter
					driver.findElement(By.xpath("//label[@class='ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder'][normalize-space()='Choose']")).click();
					driver.findElement(By.xpath("(//li[contains(text(),'Sivaramakrishna Chintala')])[2]")).click();
					Thread.sleep(1000);
					// Select Recruiter
					driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[26]/div/div[2]/label")).click();
					driver.findElement(By.xpath("//*[@id=\"accordionBasicInformation\"]/div/div/div[26]/div/div[4]/div[2]/ul/li[2]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"description\"]/div[2]/div[1]")).click();
					Thread.sleep(1000);
					//SAVE button
					
					driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
					
					
					Thread.sleep(1000);
					 String NewJobpopMsg2 = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[1]/p")).
							  getText();
							  
							  System.out.println(NewJobpopMsg2);
							  
							  //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
							  driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/button")
							  ).click();
					
				  
	  
}
	
	/*
	public void addtitle() {
		driver.findElement(addtitle).sendKeys("NewHob");
	}
	
	public void addposition() {
		driver.findElement(addposition).click();
		driver.findElement(By.xpath("//li[normalize-space()='Contract']")).click();
	}*/
	
	
	

}
