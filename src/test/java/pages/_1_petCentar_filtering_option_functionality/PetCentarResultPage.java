package pages._1_petCentar_filtering_option_functionality;

import helpers.BaseHelper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PetCentarResultPage extends BaseHelper {


    WebDriver driver;
    public PetCentarResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ctl49_Filter1_RptFilters_ctl01_RptFilter_ctl11_LnkFilter")
    WebElement unitedPets;

    public void filterClick(String searchTerm) {
        unitedPets.click();
        }


    public void firstAssignment2(String searchTerm) {
        filterClick(searchTerm);
    }


}
