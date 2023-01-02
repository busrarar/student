package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.Logs;
import utilis.Utilities;

import java.util.List;


public class TabControlPage extends Utilities {
    @FindBy(xpath = "//li[@class='tab-link']")
    public List<WebElement> tabMenuElements;

    @FindBy(xpath = "//article[@class='component-item'][1]")
    public WebElement lblFirstComponent;

    @FindBy(xpath = "//div[@class='products']/div")
    public List<WebElement> productListName;


    public void clickTabMenuElement(String itemName) {
        for (WebElement tabMenuElement : tabMenuElements) {
            if (tabMenuElement.getText().equalsIgnoreCase(itemName)) {
                clickElement(tabMenuElement);
                return;
            }
        }
        Assert.fail("No menu item called" + itemName + "could be located on the elements page");
    }

    public void controlFourProduct() {
        for (int i = 0; i < 4; i++) {
            Logs.info(productListName.get(i).findElement(By.xpath("//img")).getAttribute("src"));
            Logs.info(productListName.get(i).getAttribute("title"));
        }
    }
}
