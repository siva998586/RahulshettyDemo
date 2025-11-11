package JobManagement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyJobsPage_page {
	public WebDriver driver;
	
	public By JobManagementLink = By.xpath("//a[normalize-space()='Job Management']");
	public By MyJobs_Link = By.xpath("//a[@class='nav-link'][normalize-space()='My Jobs']");
	
		public  MyJobsPage_page(WebDriver driver) {
		this.driver = driver;
		}
	
	public void ClickMyJobs_Link() throws InterruptedException, IOException {
    	Thread.sleep(4000);
    	driver.findElement(JobManagementLink).click();
    	Thread.sleep(2000);
    	driver.findElement(MyJobs_Link).click();
	
	
	}
}
