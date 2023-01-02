package utilis;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilis.driver.Driver;

import java.util.ArrayList;

public class Utilities extends Driver {

    public Utilities() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver), this);
    }

    public void navigate(String url) {
        driver.get(url);
    }

    public void waitFor(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException ignored) {
        }
    }


    public WebElement centerElement(WebElement element) {
        String script =
                "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                        + "var elementTop = arguments[0].getBoundingClientRect().top;"
                        + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        ((JavascriptExecutor) driver).executeScript(script, element);

        return element;
    }



    public void clickElement(WebElement element) {
        centerElement(element).click();
    }

    public void fillInput(String input, WebElement inputElement) {
        inputElement.sendKeys(input);
    }


    public void checkControlPage(String itemName) {
        String actualTitle = driver.getCurrentUrl();
        Assert.assertEquals(actualTitle, itemName);
    }


    public void switchToWindow(){
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }


}
