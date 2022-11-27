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

    @FindBy(className = "product-list")
    WebElement productList;

    public void filterAndAssert(String searchTerm) {
        unitedPets.click();
        List<WebElement> productItem = productList.findElements(By.className("product-item"));
        int brojrezultata = productItem.size();
        System.out.println("broj rezultata je " + brojrezultata);
        for (WebElement result : productItem) {
            String naslov = result.findElement(By.className("product-item__title")).getText();
            Assertions.assertTrue(naslov.toUpperCase().contains(searchTerm.toUpperCase()));
        }

    }

    public void firstAssignment2(String searchTerm) {
        filterAndAssert(searchTerm);
    }


}
