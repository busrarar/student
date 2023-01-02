package steps;

import io.cucumber.java.en.Given;
import pages.TabControlPage;

import java.util.logging.Logger;

public class TabControlSteps {
    TabControlPage tabControlPage = new TabControlPage();


    @Given("Click {string} on tab")
    public void clickTabMenu(String tabMenuName) {
        tabControlPage.clickTabMenuElement(tabMenuName);
    }

    @Given("Click first component")
    public void clickTabMenu() {
        tabControlPage.clickElement(tabControlPage.lblFirstComponent);
    }

    @Given("Check fourth product and image")
    public void checkFourProduct() {
        tabControlPage.controlFourProduct();
    }
}
