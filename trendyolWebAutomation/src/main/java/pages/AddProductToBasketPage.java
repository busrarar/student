package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.Utilities;

import java.util.ArrayList;
import java.util.List;

public class AddProductToBasketPage extends Utilities {
    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement srcbxProduct;

    @FindBy(xpath = "//input[@class='fltr-srch-inpt']")
    public WebElement srcbxBrand;

    @FindBy(xpath = "//div[text()='Monster']")
    public WebElement chbBrand;

    @FindBy(xpath = "//input[@class='fltr-srch-prc-rng-input min']")
    public WebElement lblMinPrice;

    @FindBy(xpath = "//input[@class='fltr-srch-prc-rng-input max']")
    public WebElement lblMaxPrice;

    @FindBy(xpath = "//button[@class='fltr-srch-prc-rng-srch']")
    public WebElement btnPrice;

    @FindBy(xpath = "//div[@class='slctd-fltr-item']")
    public WebElement lblFilterControl;

    @FindBy(xpath = "//span[@class='prdct-desc-cntnr-name hasRatings']")
    public WebElement btnProduct;

    @FindBy(xpath = "//button[@class='add-to-basket']")
    public WebElement btnAddBasket;

    @FindBy(xpath = "//div[@class='fltr-cntnr-ttl']")
    public List<WebElement> menuElements;

    @FindBy(xpath = "//i[@class='fvrt-btn'][1]")
    public WebElement btnFav;

    @FindBy(xpath = "//p[@class='link-text']")
    public List<WebElement> topMenuElements;

    @FindBy(xpath = "//span[text()='Sepete Ekle']")
    public WebElement btnBasketAdd;

    @FindBy(xpath = "//div[@class='basket-item-count-container visible']")
    public WebElement txtbasketCount;


    public void clickLeftBarMenuElement(String itemName){
        for(WebElement menuElement:menuElements){
            if(menuElement.getText().equalsIgnoreCase(itemName)){
                clickElement(menuElement);
                return;
            }
        }
        Assert.fail("No menu item called" + itemName + "could be located on the elements page");
    }

    public void clickTopBarMenuElement(String itemName){
        for(WebElement topMenuElement:topMenuElements){
            if(topMenuElement.getText().equalsIgnoreCase(itemName)){
                clickElement(topMenuElement);
                return;
            }
        }
        Assert.fail("No menu item called" + itemName + "could be located on the elements page");
    }

    public void checkBasketIcon(String basketControlText) {
        String actualText = txtbasketCount.getText();
        Assert.assertEquals(actualText, basketControlText);
    }


}
