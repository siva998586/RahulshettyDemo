import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEndAutomationUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		Thread.sleep(3000);
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default ui-state-highlight ui-state-active'])")).click();

		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			System.out.println("its disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		// Below elements are for search button
		// driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// driver.findElement(By.cssSelector("input[type='submit']")).click();
		// Second day working
		// driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}
}
