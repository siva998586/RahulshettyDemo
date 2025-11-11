package LaunchBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration; // Import Duration class
import LoginPage.ATSLogin_Page;

public class ATSLoginTest {
    private WebDriver driver;
    private ATSLogin_Page LoginPage;
    private WebDriverWait wait; // Declare WebDriverWait as a class variable

    @BeforeMethod
    public void BrowserLaunch() {
        System.setProperty("webdriver.gecko.driver", "D:\\SivaramData\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();

        // Initialize the ATSLoginPage object
        LoginPage = new ATSLogin_Page(driver);

        // Set up WebDriverWait with 10 seconds maximum wait time
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Launch the Browser and navigate to
        driver.manage().window().maximize();
        driver.navigate().to("http://192.168.1.96/#/login");
    }

    @Test
    public void EnterLoginCredentials() {
        // Call methods on the LoginPage object
        LoginPage.enterUsername("atsin@abacusservice.in");
        LoginPage.enterPassword("Abacus@123");
        LoginPage.clickLoginButton();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
