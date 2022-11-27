package pages._3_petCentar_add_to_cart_functionality;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetCentarAddToCartFunctionalityProductPage extends BaseHelper {
    WebDriver driver;

    public PetCentarAddToCartFunctionalityProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="ctl47_ProductDetails1_RptProductVariants_ctl00_TbQty")
    WebElement quantity;


    @FindBy(id="ctl47_ProductDetails1_RptProductVariants_ctl00_BtnAdd2Basket")
    WebElement cart;

    private void quantityandAddtoCart(String amount){
        quantity.clear();
        quantity.sendKeys(amount);
        cart.click();
    }

    public void productPage(String amount){;
        quantityandAddtoCart(amount);
    }
}
