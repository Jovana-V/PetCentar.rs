package pages._3_addToCart;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PetCentarAddToCartFunctionalityKZM extends BaseHelper {
    WebDriver driver;

    public PetCentarAddToCartFunctionalityKZM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "product-list")
    WebElement productList;


    private void selectFromList() {
        List<WebElement> listItem = productList.findElements(By.tagName("article"));
        js.executeScript("window.scrollBy(0,1000)");
        listItem.get(17).click();
    }

    public void chooseProductFromResultPage() {
        selectFromList();

    }
}
