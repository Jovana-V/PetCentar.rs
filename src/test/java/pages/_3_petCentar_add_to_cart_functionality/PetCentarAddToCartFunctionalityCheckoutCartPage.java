package pages._3_petCentar_add_to_cart_functionality;

import helpers.BaseHelper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetCentarAddToCartFunctionalityCheckoutCartPage extends BaseHelper {
    WebDriver driver;

    public PetCentarAddToCartFunctionalityCheckoutCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "basket__product-price")
    WebElement productPrice;

    @FindBy(name = "ctl48$Basket21$rptBasket$ctl01$tbQty")
    WebElement quantity;

    @FindBy(css = ".price.price--total")
    WebElement priceTotal;

    @FindBy(xpath = "//td[contains(text(), \"190,00 din\")]")
    WebElement shipping;

    @FindBy(className = "basket-small__quantity")
    WebElement basketCase;

    private void addQuantityAndVerify() {
        int parsedProductPrice = Integer.parseInt(productPrice.getText().replace(",00", "").replace(".", ""));
        int parseQuantity = Integer.parseInt(quantity.getAttribute("value"));
        int parsePriceTotal = Integer.parseInt(priceTotal.getText().replace(",00 din", "").replace(".", ""));
        int parseShipping = Integer.parseInt(shipping.getText().replace(",00 din", "").replace(".", ""));
        int parseBasketCart = Integer.parseInt(basketCase.getText());

        Assertions.assertEquals(parseBasketCart, parseQuantity);
        Assertions.assertTrue(parsePriceTotal == parsedProductPrice * parseQuantity + parseShipping);


    }

    public void addToCartPage() {
        addQuantityAndVerify();
    }

}
