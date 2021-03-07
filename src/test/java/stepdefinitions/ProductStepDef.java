package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.ProductDetailPage;
import pages.ProductListPage;
import pages.DashboardPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.Iterator;
import java.util.Set;

public class ProductStepDef {

    String productDetailname="";

    @When("user hover to {string} categories")
    public void user_hover_to_kozmetik_categories(String headers) {
        DashboardPage productPage=new DashboardPage();
        BrowserUtilities.waitFor(2);
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(productPage.mainHeaderList(headers)).perform();
        BrowserUtilities.waitFor(2);

    }

    @When("user click {string} section")
    public void user_click_parfüm_section(String subitem) {
        DashboardPage productPage=new DashboardPage();
        productPage.subitem.click();
        BrowserUtilities.waitFor(3);

    }
    @When("user search {string} product")
    public void user_search_product(String item) {
        DashboardPage productPage=new DashboardPage();
        productPage.searchBox.sendKeys(item);
        BrowserUtilities.waitFor(1);


    }
    @When("user select {string} section")
    public void user_select_section(String string) {
        DashboardPage productPage=new DashboardPage();
        productPage.selectOptions.click();
        BrowserUtilities.waitFor(2);
    }
    @When("user click {string} product")
    public void user_click_product(String proNumber) {
        ProductListPage productListPage=new ProductListPage();
        productListPage.selectProduct(proNumber);
        BrowserUtilities.waitFor(3);

        String parent=Driver.get().getWindowHandle();
        Set<String> s=Driver.get().getWindowHandles();
     // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext()) {
            String child_window=I1.next();
            if(!parent.equals(child_window)) {
                Driver.get().switchTo().window(child_window);
                System.out.println(Driver.get().switchTo().window(child_window).getTitle());
            }

        }


    }
    @When("user add favorites")
    public void user_add_favorites() {
        BrowserUtilities.waitFor(2);
        ProductDetailPage productDetailPage=new ProductDetailPage();
        productDetailname=productDetailPage.productName.getText();
        BrowserUtilities.hover(productDetailPage.addFavorites);
        BrowserUtilities.waitFor(1);
        productDetailPage.addFavorites.click();
        BrowserUtilities.waitFor(1);

    }
    @When("user go to favorites page")
    public void user_go_to_favorites_page() {
        ProductDetailPage productDetailPage=new ProductDetailPage();
        productDetailPage.fovoriButton.click();
        BrowserUtilities.waitFor(3);

    }
    @Then("user match product name")
    public void user_match_product_name() {
        ProductDetailPage productDetailPage=new ProductDetailPage();
        String productFavName=productDetailPage.productFavoName.getText();
        System.out.println("productDetailname = " + productDetailname);
        System.out.println("productFavName = " + productFavName);
        Assert.assertEquals(productDetailname,productFavName);
        Driver.get().quit();


    }

}
