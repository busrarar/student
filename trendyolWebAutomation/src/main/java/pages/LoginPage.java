package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.Utilities;

public class LoginPage extends Utilities {
    @FindBy(xpath = "//p[text()='Giriş Yap']")
    public WebElement btnLogin;

    @FindBy(xpath = "//button[text()='KABUL ET']")
    public WebElement btnAcceptCookie;

    @FindBy(id = "login-email")
    public WebElement txtemail;

    @FindBy(id = "login-password-input")
    public WebElement txtpassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btnSubmit;

    @FindBy(xpath = "//p[text()='Hesabım']")
    public WebElement lblMyAccount;

    @FindBy(id = "error-box-wrapper")
    public WebElement lbl_error_message;

    @FindBy(xpath = "//span[text()='Şifremi Unuttum']")
    public WebElement btnForgetPassword;

}
