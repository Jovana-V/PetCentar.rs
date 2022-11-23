package tests;

import org.junit.jupiter.api.Test;
import pages._2_search.PetCentarHomePage;
import pages._2_search.PetCentarSearchFunctionalityResultsPage;

public class PetCentarSearchFunctionalityTest extends BaseTest {


    @Test
    public void SearchFunctionalityTest() {
        PetCentarHomePage petCentarSearchFunctionalityPOM = new PetCentarHomePage(driver);
        PetCentarSearchFunctionalityResultsPage petCentarSearchFunctionalityResultsPagePOM=new PetCentarSearchFunctionalityResultsPage(driver);
        petCentarSearchFunctionalityPOM.secondAssignment();
        petCentarSearchFunctionalityResultsPagePOM.sortPricePublic();

    }


}
