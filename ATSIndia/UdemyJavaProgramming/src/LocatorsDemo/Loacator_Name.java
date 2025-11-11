package LocatorsDemo;

public class Loacator_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// identify the Locator by using "ID" attribute
		// <input type="email" name="email" id="email" required="" autocomplete="email" class="form-input p-v-1-xs p-l-2-xs p-r-4-xs col-12-xs bodyMain error" aria-live="polite">
		
		
		driver.findElement(By.id("email"));
		
		// identify the Locator by using "Name" attribute
		
		driver.findElement(By.Name("email"));
		
		
		// identify the Locator by using "ClassName" attribute
		
		
		driver.findElement(By.ClassName("form-input p-v-1-xs p-l-2-xs p-r-4-xs col-12-xs bodyMain error"));
		
		
		// identify the Locator by using "LinkText" attribute
		
		//  For link text --- > <a class="bodySmall form-footer" href="/secure/9521/identity/forgot_password">Forgot Password</a>
		
		
		driver.findElement(By.linkText("Forgot Password"));
		
		
		
		// How to locate a web element by using the "TagName"?
		// The tagName locator returns all the elements from the page that contains a specified tag.
		
		driver.findElement(By.tagName("a"));
		
		// How to locate a web element by using the "CSSselector"?
		
		/* Example: <div class="m-b-4-xs">
		<label class="form-label bodyMain p-b-0-xs m-b-2-xs" for="email">Email</label>
		<input type="email" name="email" id="email" required="" autocomplete="email" class="form-input p-v-1-xs p-l-2-xs p-r-4-xs col-12-xs bodyMain error" aria-live="polite" xpath="1" style=""><div class="inline-error">This field is required</div>
		</div>
		*/
		
		driver.findElement(By.cssSelector("input['id=email']"));
		
	//	How to locate a web element by using the "xpath" attribute?
		
		
		driver.findElement(By.xpath("input['id=email']"));
		
		driver.findElement(By.xpath("//input[@id='Name']")); 			// rel xpath  --> //input[@name='name'])
		
		driver.findElement(By.xpath("input[@name='name'])[1]");
		
		driver.findElement(By.xpath("//*[id='email']"));
		
		
		
		
		
		
		
		
		
	}

}
