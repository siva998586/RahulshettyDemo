import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		/*WebElement santosh = driver.findElement(By.id("checkBoxOption1"));
		santosh.click();
		if(santosh.isSelected()) {
			System.out.println("Checkbox is successfully checked");
		}
		else {
			System.out.println("Not checked");
		}
		
		if(santosh.isSelected()) {
			santosh.click();
		}
		if(!santosh.isSelected()) {
			System.out.println("Check box is successfully unchecked");
		}
		else {
			System.out.println("still checked");
		}*/
		
		
		}
		

	}


