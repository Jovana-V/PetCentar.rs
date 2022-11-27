package tests;

import org.junit.jupiter.api.Test;
import pages._1_petCentar_filtering_option_functionality.PetCentarHomepage;
import pages._1_petCentar_filtering_option_functionality.PetCentarResultPage;

public class _1_PetCentarFilteringOptionFunctionalityTEST extends BaseTest {

    @Test
    public void filteringOptionsTest() {
        String searchTerm = "UNITED PETS";
        String url = "https://www.pet-centar.rs";

        PetCentarHomepage first_1_1PetCentarFilteringOptionsHomepagePOM = new PetCentarHomepage(driver);
        PetCentarResultPage first_1_2PetCentarFilteringOptionsResultPagePOM = new PetCentarResultPage(driver);
        first_1_1PetCentarFilteringOptionsHomepagePOM.firstAssignment1(url);
        first_1_2PetCentarFilteringOptionsResultPagePOM.firstAssignment2(searchTerm);


    }

}
