package Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoleAdministratorPage {
    private WebDriver driver;

    public RoleAdministratorPage(WebDriver driver) {
        this.driver = driver;
    }

    // Role Administration link
    public WebElement getRoleAdminLink() {
        return driver.findElement(By.xpath("//a[normalize-space()='Role Administration']"));
    }

    // Add Role Button
    public WebElement getAddRoleButton() {
        return driver.findElement(By.linkText("Add Role"));
    }

    // Enter Role name text field
    public WebElement getEnterRoleTextField() {
        return driver.findElement(By.xpath("//input[@placeholder='Enter Role Name']"));
    }

    // SAVE button
    public WebElement getRoleSaveButton() {
        return driver.findElement(By.xpath("//span[normalize-space()='Save']"));
    }

    // Close button
    public WebElement getCloseButton() {
        return driver.findElement(By.xpath("//button[@title='Close']"));
    }
}