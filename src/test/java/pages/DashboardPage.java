package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtilities;


import java.util.List;

public class DashboardPage extends BasePage {


     @FindBy(css = "[class='tab-link']")
     public List<WebElement>  mainheader;

     public  WebElement  mainHeaderList(String headerName){
         WebElement header=null;
         BrowserUtilities.waitFor(1);
         for (WebElement element : mainheader) {
             if (element.getText().equals(headerName)){
                 header=element;
             }
         }
         return  header;
     }

    @FindBy(xpath = "(//*[contains(@href,'parfum')])[4]")
    public WebElement subitem;

    @FindBy(css= "[class='fltr-srch-inpt']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[text()='Lacoste']")
    public WebElement selectOptions;








}
