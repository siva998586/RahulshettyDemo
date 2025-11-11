package TalentManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class NewCandidate_UploadResume {
	 WebDriver driver;
	 
	 
		@Test(priority=0)
		public void BrowserLaunch() throws InterruptedException {
			ATSLoginTest launch = new ATSLoginTest();
			launch.BrowserLaunch();
			launch.EnterLoginCredentials();
		}
	
		@Test(priority=1)
		public void UploadResume() throws InterruptedException, IOException {
			
			driver.findElement(By.xpath("//div[@class='form-group homedashboardtxt']//a[normalize-space()='New Candidate']")).click();
			
			 
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			 //driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
			
			 // Find the "Upload Resume" tab element by its link text
			
		        WebElement uploadResumeTab =  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Upload Resume"))));
		        
		      driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		        // Click on the "Upload Resume" tab
		        uploadResumeTab.click();
			
			
			 
		        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		        
		     // Locate the file input element by its ID or another appropriate selector
		        WebElement fileInput = driver.findElement(By.id("FileUpload"));

		        // Provide the path to the file you want to upload
		        String filePath = "D:\\Selvaraj M_ MS AD L3_ Abacus.docx";
		        
		        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		        // Set the file path in the file input element
		        fileInput.sendKeys(filePath);
		        
		        driver.findElement(By.xpath("//span[normalize-space()='Upload']")).click();
		        
		        WebElement modalContent = driver.findElement(By.className("modal-content"));
		        
		        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		        // Check if the modal contains the text "File already exists"
		        if (modalContent.getText().contains("File already exists")) {
		        	System.out.println("File already exists");
		            // Find the "OK" button and click it
		            WebElement okButton = modalContent.findElement(By.className("btn-primary"));
		            okButton.click();
		        }
		  
		}
				
			 
			
		}


