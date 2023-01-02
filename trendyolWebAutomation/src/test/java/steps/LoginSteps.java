package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("Accept Cookies for page")
    public void acceptCookies() {
        loginPage.waitFor(2);
        loginPage.clickElement(loginPage.btnAcceptCookie);
    }


    @Given("Go to Login Page")
    public void click() {
        loginPage.clickElement(loginPage.btnLogin);
    }

    @Given("Enter {string} on email field")
    public void setOnUsernameField(String email) {
        loginPage.fillInput(email, loginPage.txtemail);
    }

    @Given("Enter {string} on password field")
    public void setOnPasswordField(String password) {
        loginPage.fillInput(password, loginPage.txtpassword);
    }

    @When("Click Login Button")
    public void clickLoginButton() {
        loginPage.clickElement(loginPage.btnSubmit);
    }

    @Then("{string} element is enable")
    public void elementIsEnable(String myAccount) {
        loginPage.waitFor(2);
        if (!myAccount.equals(loginPage.lblMyAccount.getText())) {
            Assert.fail("Failed to login");
        }
    }

    @Then("Error message is {string}")
    public void errorMessageIs(String errorMessage) {
        if (!errorMessage.equals(loginPage.lbl_error_message.getText())) {
            Assert.fail("Failed to error message");
        }
    }

    @When("Click Forget Password")
    public void clickForgetToPassword() {
        loginPage.clickElement(loginPage.btnForgetPassword);
    }

    @And("Check page control for Login page")
    public void checkLetter() {
        Assert.assertTrue("Page is not open", loginPage.btnSubmit.isDisplayed());
    }

}
