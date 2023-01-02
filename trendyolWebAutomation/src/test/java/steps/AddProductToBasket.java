package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AddProductToBasketPage;

public class AddProductToBasket {
    AddProductToBasketPage productBasketPage = new AddProductToBasketPage();


    @Given("Enter {string} on search field")
    public void clickSearchField(String product) {
        productBasketPage.fillInput(product, productBasketPage.srcbxProduct);
        productBasketPage.srcbxProduct.sendKeys(Keys.ENTER);
    }

    @Given("Check page control for List page")
    public void checkPageControl() {
        Assert.assertTrue("Page is not open",productBasketPage.srcbxBrand.isDisplayed());
    }

    @Given("Select {string} on the filter brand field")
    public void clickBrandProduct(String brand) {
        productBasketPage.waitFor(2);
        productBasketPage.fillInput(brand, productBasketPage.srcbxBrand);
        productBasketPage.clickElement(productBasketPage.chbBrand);

    }

    @Given("Click menu item called {string}")
    public void clickMenuItem(String itemName) {
        productBasketPage.clickLeftBarMenuElement(itemName);

    }

    @Given("Select min {string} and max {string} on the filter price field")
    public void clickBrandProduct(String minPrice, String maxPrice) {
        productBasketPage.fillInput(minPrice, productBasketPage.lblMinPrice);
        productBasketPage.fillInput(maxPrice, productBasketPage.lblMaxPrice);
        productBasketPage.clickElement(productBasketPage.btnPrice);
    }

    @Given("Check product by filtering")
    public void checkProductFilter() {
        Assert.assertTrue("Filtering is not seen",productBasketPage.lblFilterControl.isDisplayed());
    }

    @Given("Click product on list page")
    public void clickProductDetail() {
        productBasketPage.clickElement(productBasketPage.btnProduct);
    }

    @Given("Switch to window")
    public void changeWindow() {
        productBasketPage.switchToWindow();
    }

    @Given("Add product to basket")
    public void clickAddBasket() {
        productBasketPage.clickElement(productBasketPage.btnAddBasket);
    }

    @Given("Add favorite to product")
    public void selectFavProduct() {
        productBasketPage.clickElement(productBasketPage.btnFav);
    }

    @Given("Click {string} section")
    public void clickFavProduct(String itemName) {
        productBasketPage.clickTopBarMenuElement(itemName);
    }

    @Given("Check {string} page")
    public void checkFavPage(String itemName) {
        productBasketPage.checkControlPage(itemName);
    }

    @Given("Add product to basket on favorite page")
    public void checkFavPage() {
        productBasketPage.clickElement(productBasketPage.btnBasketAdd);
    }

    @Given("Check basket icon as {string}")
    public void checkBasketIcon(String basketCount) {
        productBasketPage.checkBasketIcon(basketCount);
    }
}
