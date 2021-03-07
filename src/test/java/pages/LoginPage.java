package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage extends BasePage {

    @FindBy(css= "[class='login-button']")
    public WebElement login;

    @FindBy(css = "[title='Close']")
    public WebElement close;

    @FindBy(xpath = "(//*[@class='social-login-icon'])[1]")
    public WebElement facebookButton;

    @FindBy(css = "[type='text']")
    public  WebElement emailBox;

    @FindBy(css = "[type='password']")
    public  WebElement passwordBox;

    @FindBy(css = "[name='login']")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement continuWithName;

    @FindBy(css = "[class='modal-close']")
    public WebElement exitButton;

    @FindBy(css = "[name='login-password']")
    public WebElement loginPasswordBox;

    @FindBy(css = "[class*='submit']")
    public WebElement loginSubmitButton;

    @FindBy(css = "[id='login-email']")
    public WebElement loginEmailBox;

    @FindBy(css = "[class='link account-user']")
    public WebElement accountButton;

    @FindBy(css = "[class='user-name']")
    public WebElement userName;







}
