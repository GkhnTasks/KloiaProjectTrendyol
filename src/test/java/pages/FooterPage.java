package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FooterPage extends BasePage{

    @FindBy(css = "[class='footer__wrapper--sectionTitle']")
    public List<WebElement> footerMainLink;

    @FindBy(xpath = "//*[text()='Canlı Yardım']")
    public  WebElement liveChatLink;




}
