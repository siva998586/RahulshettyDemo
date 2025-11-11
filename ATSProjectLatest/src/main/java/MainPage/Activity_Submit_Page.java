package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity_Submit_Page {
	
	private WebDriver driver;

    public Activity_Submit_Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement Candidate_pavanKumar() {
        return driver.findElement(By.xpath("//*[@id=\"grid-height\"]/div[1]/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[1]/span/a"));
    }
    
    // View Candidate real screen -> Activities -> Submit
    public WebElement Submit_icon() {
        return driver.findElement(By.xpath("//button[@title='Submit Activities']"));
    }
    
    public WebElement Activity_Search() {
        return driver.findElement(By.xpath("//button[@title='More Search Options']//span[contains(text(),'Search')]"));
    }
    
    public WebElement Activity_ATSID_Search() {
        return driver.findElement(By.xpath("//input[@id='atsRef']"));
    }
        
    public WebElement Activity_Search_Button() {
        return driver.findElement(By.xpath("//button[@id='search']//span[contains(text(),'Search')]"));
    }
    
        public WebElement Activity_internal_note() {
        return driver.findElement(By.xpath("//textarea[@id='internal_note']"));
    }
    
        public WebElement Activity_agreed_pay_ratee() {
            return driver.findElement(By.xpath("//input[@id='agreed_pay_rate_first']"));
    }
        
        public WebElement Activity_submit() {
            return driver.findElement(By.xpath("//button[@id='submit']"));
    }
  
  

}
