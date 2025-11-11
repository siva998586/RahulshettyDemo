package MainTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

	public class Activity_ApprovedTest {
			WebDriver driver;
			 
			@Test(priority=0)
			public void BrowserLaunch() throws InterruptedException {
				ATSLoginTest launch = new ATSLoginTest();
				 driver = launch.BrowserLaunch();
				launch.EnterLoginCredentials();
			}

		   @Test
		    public void Select_DateTime() throws InterruptedException {
			driver.findElement(By.xpath("//div[@class='form-group homedashboardtxt']//a[normalize-space()='Candidate List']")).click();
				
			//Click on any Candidate
			Thread.sleep(3000);
			
			String originalWindow = driver.getWindowHandle();
			System.out.println("mainwindow ="+ originalWindow);
		 				 
			driver.findElement(By.linkText("Murali")).click();
					
			// Click on ACtivity downarrow
			driver.findElement(By.xpath("//a[@data-target='#accordionCollapseActivites']//i")).click();
						        
	        // Locate the table element
	        WebElement table = driver.findElement(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']"));

	        // Locate all the rows within the table
	        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));

	        // Iterate through the rows
	        for (WebElement row : rows) {
	        // Locate the datetime cell (assuming it's in the first column)
	        WebElement datetimeCell = row.findElement(By.tagName("td"));

	        // Extract the text from the datetime cell
	        String cellText = datetimeCell.getText();

	        // Check if the cell text matches the desired datetime value
	        if (cellText.equals(cellText)) {
	        // Click on the datetime cell
	        datetimeCell.click();
	        break; // Exit the loop once clicked
	        
	            }
	        }
	        
	       WebElement Internalnotes = driver.findElement(By.xpath("//textarea[@id='internalNotes']"));
	       Internalnotes.clear();
	       
	       Thread.sleep(2000);
	       
	       Internalnotes.sendKeys("Approved");
	       
	       // Click on Approved button afterfilling all fields
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"approve\"]/span[2]")).click();
	       
	       //Popup message handle - get popup text 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 String SubmitpopMSG = driver.findElement(By.xpath("/html/body/div[38]/div[2]/div/div/div[1]/p")).getText();
			 System.out.println(SubmitpopMSG);
					  
		   //POPUP WINDOW CLOSE BY CLICKING ON SAVE BUTTON
			 driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();		
		   			 
		   //Logout and Login again 
				 
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/header/div[3]/ul/li[5]/a/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/header/div[3]/ul/li[5]/div/button[3]/span")).click();
	        
	        // Close the WebDriver
	        driver.quit();
	    }
	}