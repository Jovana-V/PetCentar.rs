package pages._1_petCentar_filtering_option_functionality;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PetCentarHomepage extends BaseHelper {
    WebDriver driver;

    public PetCentarHomepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ctl53_Header1_CookiesEuBox_btnAcceptAll")
    WebElement popUpCookieButton;

    @FindBy(id = "ctl53_FilterHomepage1_RptFilters_ctl00_LnkFilterName")
    WebElement psi;
    @FindBy(id = "ctl53_FilterHomepage1_RptFilters_ctl00_RptFilter_ctl07_LnkFilter")
    WebElement igracke;


    private void navigateToHomepage(String url) {
        driver.get(url);
    }

    private void closeCookieButton() {
        wdWait.until(ExpectedConditions.visibilityOf(popUpCookieButton));
        popUpCookieButton.click();

    }

    private void selectIgracke() {
        actions = new Actions(driver);
        actions.moveToElement(psi).perform();
        igracke.click();
    }


    public void firstAssignment1(String url) {
        navigateToHomepage(url);
        closeCookieButton();
        selectIgracke();
    }
}