package tests;

import org.junit.jupiter.api.Test;
import pages._3_petCentar_add_to_cart_functionality.PetCentarAddToCartFunctionalityHomepage;
import pages._3_petCentar_add_to_cart_functionality.PetCentarAddToCartFunctionalityKZM;
import pages._3_petCentar_add_to_cart_functionality.PetCentarAddToCartFunctionalityProductPage;
import pages._3_petCentar_add_to_cart_functionality.PetCentarAddToCartFunctionalityCheckoutCartPage;

public class _3_PetCentarAddToCartFunctionalityTEST extends BaseTest {

    @Test
    public void addToCartTest() {
        String url = "https://www.pet-centar.rs";
        String amount = "2";
        PetCentarAddToCartFunctionalityHomepage petCentarAddToCartFunctionalityHomepage = new PetCentarAddToCartFunctionalityHomepage(driver);
        PetCentarAddToCartFunctionalityKZM petCentarAddToCartFunctionalityKZM = new PetCentarAddToCartFunctionalityKZM(driver);
        PetCentarAddToCartFunctionalityProductPage petCentarAddToCartFunctionalityProductPage = new PetCentarAddToCartFunctionalityProductPage(driver);
        PetCentarAddToCartFunctionalityCheckoutCartPage petCentarAddToCartFunctionalityCheckoutCartPage = new PetCentarAddToCartFunctionalityCheckoutCartPage(driver);

        petCentarAddToCartFunctionalityHomepage.navigateToPetCentar(url);
        petCentarAddToCartFunctionalityKZM.chooseProductFromResultPage();
        petCentarAddToCartFunctionalityProductPage.productPage(amount);
        petCentarAddToCartFunctionalityCheckoutCartPage.addToCartPage();



    }
}
