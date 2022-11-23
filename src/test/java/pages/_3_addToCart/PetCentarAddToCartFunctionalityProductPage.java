package pages._3_addToCart;

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

    private void quantityandAddtoCart(){
        quantity.clear();
        quantity.sendKeys("2");
        cart.click();
    }

    public void productPage(){;
        quantityandAddtoCart();
    }
}
