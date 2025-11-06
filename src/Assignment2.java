import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Santosh Kumar");
		driver.findElement(By.name("email")).sendKeys("santosh94@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("MSK5280@");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		/*dropdown.selectByVisibleText("Male");
		System.out.println(dropdown.getFirstSelectedOption().getText());*/
		dropdown.selectByVisibleText("Female");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("08-04-1994");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());
		
		//System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]/strong")).getText());
}

}
