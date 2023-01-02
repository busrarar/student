package utilis.driver;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.github.webdriverextensions.Bot.driver;

public class Driver extends WebComponent {
    public static WebDriver driver;
    @BeforeSuite

    public void initialize() {
        driver = DriverFactory.getDriver("chrome", driver);
    }
    @AfterSuite

    public void closed() {
        driver.quit();
    }


}
