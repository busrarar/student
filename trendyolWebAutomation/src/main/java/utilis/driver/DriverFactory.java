package utilis.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {


    public static WebDriver getDriver(String driverName, WebDriver driver) {
        Properties properties = new Properties();
        String propertyDriverName = null;

        try {
            properties.load(new FileReader("src/main/resources/test.properties"));
            propertyDriverName = properties.getProperty("browser");
        } catch (IOException e) {
            propertyDriverName = null; //bir hatada geri null yapmak için
            e.printStackTrace();
        }

        if (propertyDriverName != null) {
            driverName = propertyDriverName;
        }

        switch (driverName.toLowerCase()) {
            case "safari":
                if (System.getProperty("os.name").toLowerCase().contains("windows"))
                    throw new WebDriverException("You are operating Windows OS which doesn't support Safari");
                WebDriverManager.getInstance(SafariDriver.class).setup();
                driver = new SafariDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--disable-popup-blocking");
                firefoxOptions.addArguments("incognito");
                driver = new FirefoxDriver(firefoxOptions);


            default:
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-popup-blocking");
                options.addArguments("incognito");
                driver = new ChromeDriver(options);
                break;
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;

        }

    }


