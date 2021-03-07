package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.print.DocFlavor;

public class LoginStepDef {

    @Given("user should open login page")
    public void user_should_open_login_page()  {

        LoginPage loginPage=new LoginPage();
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtilities.waitFor(5);
        loginPage.close.click();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(loginPage.girisYap).perform();
        BrowserUtilities.waitFor(2);
        loginPage.login.click();
        BrowserUtilities.waitFor(2);

    }

    @When("user click login with facebook")
    public void user_click_login_with_facebook() throws InterruptedException {
        /**FACEBOOK LOGİN
        LoginPage loginPage=new LoginPage();
        loginPage.facebookButton.click();
        Thread.sleep(3);
         */

    }
    @When("user type facebook account credential")
    public void user_type_facebook_account_credential()  {
        LoginPage loginPage=new LoginPage();
       /*
        loginPage.emailBox.sendKeys(ConfigurationReader.get("facebook_email"));
        Thread.sleep(2);
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("facebook_password"));
        loginPage.submitButton.click();
        Thread.sleep(3);
        loginPage.loginPasswordButton.click();
        */
        loginPage.loginEmailBox.sendKeys(ConfigurationReader.get("facebook_email"));
        loginPage.loginPasswordBox.sendKeys(ConfigurationReader.get("facebook_password"));
        loginPage.loginSubmitButton.click();
        BrowserUtilities.waitFor(4);
        loginPage.exitButton.click();
        BrowserUtilities.waitFor(2);


    }
    @Then("should see main page and verify")
    public void should_see_main_page_and_verify() {
        LoginPage loginPage=new LoginPage();
        BrowserUtilities.hover(loginPage.accountButton);
        BrowserUtilities.waitFor(1);
        Assert.assertEquals("Sami@Mailinator.Com",loginPage.userName.getText());
        Driver.get().quit();


    }

}
