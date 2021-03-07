package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends BasePage{

    @FindBy(css = "[class='p-card-wrppr add-to-bs-card']")
    public List<WebElement> allProduct;

    public  void selectProduct(String productNumber){
        int count=0;
        int num=Integer.parseInt(productNumber);
        for (WebElement element : allProduct) {
            count++;
            if (count==num){
                element.click();
            }

        }
    }
}
