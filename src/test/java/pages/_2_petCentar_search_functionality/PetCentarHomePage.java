package pages._2_petCentar_search_functionality;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PetCentarHomePage extends BaseHelper {

    WebDriver driver;

    public PetCentarHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ctl53_Header1_CookiesEuBox_btnAcceptAll")
    WebElement popUpCookieButton;

    @FindBy(id = "ctl53_Header1_SearchBox1_TbSearch")
    WebElement searchField;

    @FindBy(css = ".js-search-submit.search__btn")
    WebElement magnifyingGlass;

    private void navigateToHomepage(String url) {
        driver.get(url);
    }

    private void closeCookieButton() {
        wdWait.until(ExpectedConditions.visibilityOf(popUpCookieButton));
        popUpCookieButton.click();
    }

    private void searchFieldInput(String color) {
        wdWait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(color);
        wdWait.until(ExpectedConditions.visibilityOf(magnifyingGlass));
        magnifyingGlass.click();
    }

    public void secondAssignment(String url,String color) {
        navigateToHomepage(url);
        closeCookieButton();
        searchFieldInput(color);
    }
}
