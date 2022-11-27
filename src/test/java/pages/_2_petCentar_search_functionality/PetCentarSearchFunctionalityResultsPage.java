package pages._2_petCentar_search_functionality;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PetCentarSearchFunctionalityResultsPage extends BaseHelper {
    WebDriver driver;

    public PetCentarSearchFunctionalityResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "ctl49_ProductList21_ProductList2Products1_DDSortDB")
    WebElement selectDropdown;


    private void sortPrice(){

        select = new Select(selectDropdown);
        select.selectByValue("PRICE_ASC");
    }


    public void sortPricePublic(){
        sortPrice();
    }

}
