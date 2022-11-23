package tests;

import org.junit.jupiter.api.Test;
import pages._3_addToCart.PetCentarAddToCartFunctionalityHomepage;
import pages._3_addToCart.PetCentarAddToCartFunctionalityKZM;
import pages._3_addToCart.PetCentarAddToCartFunctionalityProductPage;
import pages._3_addToCart.PetCentarAddToCartFunctionalityCheckoutCartPage;

public class PetCentarAddToCartFunctionalityTest extends BaseTest {

    @Test
    public void addToCartTest() {

        PetCentarAddToCartFunctionalityHomepage petCentarAddToCartFunctionalityHomepage = new PetCentarAddToCartFunctionalityHomepage(driver);
        PetCentarAddToCartFunctionalityKZM petCentarAddToCartFunctionalityKZM = new PetCentarAddToCartFunctionalityKZM(driver);
        PetCentarAddToCartFunctionalityProductPage petCentarAddToCartFunctionalityProductPage = new PetCentarAddToCartFunctionalityProductPage(driver);
        PetCentarAddToCartFunctionalityCheckoutCartPage petCentarAddToCartFunctionalityCheckoutCartPage = new PetCentarAddToCartFunctionalityCheckoutCartPage(driver);

        petCentarAddToCartFunctionalityHomepage.navigateToPetCentar();
        petCentarAddToCartFunctionalityKZM.chooseProductFromResultPage();
        petCentarAddToCartFunctionalityProductPage.productPage();
        petCentarAddToCartFunctionalityCheckoutCartPage.addToCartPage();


    }
}
