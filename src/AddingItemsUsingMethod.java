import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;

public class AddingItemsUsingMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String[] items = { "Brocolli", "Cauliflower", "Cucumber", "Potato" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,items);
		
}
	public static void addItems(WebDriver driver,String[] items)
	{
		int j = 0;
	
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	for (int i = 0;i<products.size(); i++) {
		// Brocolli - 1 Kg Splitt the name based on (-)
		// Brocolli, 1 Kg

		String[] name = products.get(i).getText().split("-"); // get() will pull one particular value outoff
																// values.
		String kumar = name[0].trim(); // trim() use due to brocolli has white space so we need to remove
												// the whitespaces.
		// Convert Array into ArrayList
		// Check whether name you extracted is present or not
		List santosh = Arrays.asList(items);
		if (santosh.contains(kumar)) {
			j++;
			// click on Add to cart
			driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

			if (j == items.length)
				break;
		}
	}
}
}

