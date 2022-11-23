package tests;

import org.junit.jupiter.api.Test;
import pages._1_filters.PetCentarHomepage;
import pages._1_filters.PetCentarResultPage;

public class PetCentarFilterTest extends BaseTest {

    @Test
    public void filteringOptionsTest() {
        String searchTerm = "UNITED PETS";
        PetCentarHomepage first_1_1PetCentarFilteringOptionsHomepagePOM = new PetCentarHomepage(driver);
        PetCentarResultPage first_1_2PetCentarFilteringOptionsResultPagePOM = new PetCentarResultPage(driver);
        first_1_1PetCentarFilteringOptionsHomepagePOM.firstAssignment1();
        first_1_2PetCentarFilteringOptionsResultPagePOM.firstAssignment2(searchTerm);


    }

}
