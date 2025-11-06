import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.ndtv.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	

	}
}
