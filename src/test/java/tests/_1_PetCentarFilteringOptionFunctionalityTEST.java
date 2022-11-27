package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages._1_petCentar_filtering_option_functionality.PetCentarHomepage;
import pages._1_petCentar_filtering_option_functionality.PetCentarResultPage;

import java.util.List;

public class _1_PetCentarFilteringOptionFunctionalityTEST extends BaseTest {

    @Test
    public void filteringOptionsTest() {
        String searchTerm = "UNITED PETS";
        String url = "https://www.pet-centar.rs";

        PetCentarHomepage first_1_1PetCentarFilteringOptionsHomepagePOM = new PetCentarHomepage(driver);
        PetCentarResultPage first_1_2PetCentarFilteringOptionsResultPagePOM = new PetCentarResultPage(driver);
        first_1_1PetCentarFilteringOptionsHomepagePOM.firstAssignment1(url);
        first_1_2PetCentarFilteringOptionsResultPagePOM.firstAssignment2(searchTerm);

        WebElement productList = driver.findElement(By.className("product-list"));
        List<WebElement> productItem = productList.findElements(By.className("product-item"));
        int brojrezultata = productItem.size();
        System.out.println("broj rezultata je " + brojrezultata);
        for (WebElement result : productItem) {
            String naslov = result.findElement(By.className("product-item__title")).getText();
            Assertions.assertTrue(naslov.toUpperCase().contains(searchTerm.toUpperCase()));


        }

    }
}
