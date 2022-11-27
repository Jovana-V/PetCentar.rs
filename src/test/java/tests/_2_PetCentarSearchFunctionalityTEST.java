package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages._2_petCentar_search_functionality.PetCentarHomePage;
import pages._2_petCentar_search_functionality.PetCentarSearchFunctionalityResultsPage;

public class _2_PetCentarSearchFunctionalityTEST extends BaseTest {


    @Test
    public void SearchFunctionalityTest() {
        String url = "https://www.pet-centar.rs";
        String color = "pink";
        PetCentarHomePage petCentarSearchFunctionalityPOM = new PetCentarHomePage(driver);
        PetCentarSearchFunctionalityResultsPage petCentarSearchFunctionalityResultsPagePOM=new PetCentarSearchFunctionalityResultsPage(driver);
        petCentarSearchFunctionalityPOM.secondAssignment(url,color);
        petCentarSearchFunctionalityResultsPagePOM.sortPricePublic();

        String option = select.getFirstSelectedOption().getText();
        Assertions.assertTrue(option.contains("Cena (manja-veća)"));


    }


}
