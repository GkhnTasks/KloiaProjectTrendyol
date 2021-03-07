package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {



    @FindBy(css = "[class='pr-new-br']")
    public WebElement productName;

    @FindBy(xpath= "(//*[@class='fv-hv-img'])[1]")
    public WebElement addFavorites;

    @FindBy(xpath = "(//*[text()='Favorilere Ekle'])[2]")
    public WebElement clickaddFav;


    @FindBy(css = "[class='prdct-desc-cntnr-ttl-w']")
    public WebElement productFavoName;






}
