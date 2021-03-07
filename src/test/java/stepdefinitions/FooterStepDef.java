package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.FooterPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FooterStepDef {

    @Given("user goto footer section")
    public void user_goto_footer_section() {
        FooterPage footerPage=new FooterPage();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(footerPage.footerMainLink.get(1));
        BrowserUtilities.waitFor(2);
    }

    @When("user write footer link on txt file")
    public void user_write_footer_link_on_txt_file() {
        FooterPage footerPage=new FooterPage();
        List<String> footerLink=BrowserUtilities.getElementsText(footerPage.footerMainLink);
        BrowserUtilities.printToTxt(footerLink,"FooterMainLink");
        BrowserUtilities.waitFor(2);

    }
    @When("user click {string} link")
    public void user_click_link(String string) {
        FooterPage footerPage=new FooterPage();
        footerPage.liveChatLink.click();

    }
    @Then("user check all link")
    public void user_check_al_link() {
        FooterPage footerPage=new FooterPage();
        List<String> footerLink=BrowserUtilities.getElementsText(footerPage.footerMainLink);

        String expectedLink=footerLink.toString();
        System.out.println("expectedLink = " + expectedLink);
        String actualLink=BrowserUtilities.readTxt("text");
        System.out.println("actualLink = " + actualLink);
        Assert.assertEquals(expectedLink,actualLink);
        Driver.get().quit();

    }

}
