package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages._3_petCentar_add_to_cart_functionality.PetCentarAddToCartFunctionalityHomepage;
import pages._3_petCentar_add_to_cart_functionality.PetCentarAddToCartFunctionalityKZM;
import pages._3_petCentar_add_to_cart_functionality.PetCentarAddToCartFunctionalityProductPage;

public class _3_PetCentarAddToCartFunctionalityTEST extends BaseTest {

    @Test
    public void addToCartTest() {
        String url = "https://www.pet-centar.rs";
        String amount = "2";
        PetCentarAddToCartFunctionalityHomepage petCentarAddToCartFunctionalityHomepage = new PetCentarAddToCartFunctionalityHomepage(driver);
        PetCentarAddToCartFunctionalityKZM petCentarAddToCartFunctionalityKZM = new PetCentarAddToCartFunctionalityKZM(driver);
        PetCentarAddToCartFunctionalityProductPage petCentarAddToCartFunctionalityProductPage = new PetCentarAddToCartFunctionalityProductPage(driver);

        petCentarAddToCartFunctionalityHomepage.navigateToPetCentar(url);
        petCentarAddToCartFunctionalityKZM.chooseProductFromResultPage();
        petCentarAddToCartFunctionalityProductPage.productPage(amount);

        WebElement productPrice=driver.findElement(By.className("basket__product-price"));
        WebElement quantity=driver.findElement(By.name("ctl48$Basket21$rptBasket$ctl01$tbQty"));
        WebElement priceTotal=driver.findElement(By.cssSelector(".price.price--total"));
        WebElement shipping=driver.findElement(By.xpath("//td[contains(text(), \"190,00 din\")]"));
        WebElement basketCase=driver.findElement(By.className("basket-small__quantity"));

        int parsedProductPrice = Integer.parseInt(productPrice.getText().replace(",00", "").replace(".", ""));
        int parseQuantity = Integer.parseInt(quantity.getAttribute("value"));
        int parsePriceTotal = Integer.parseInt(priceTotal.getText().replace(",00 din", "").replace(".", ""));
        int parseShipping = Integer.parseInt(shipping.getText().replace(",00 din", "").replace(".", ""));
        int parseBasketCart = Integer.parseInt(basketCase.getText());

        Assertions.assertEquals(parseBasketCart, parseQuantity);
        Assertions.assertTrue(parsePriceTotal == parsedProductPrice * parseQuantity + parseShipping);






    }
}
