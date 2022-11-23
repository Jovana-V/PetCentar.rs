package pages._3_addToCart;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PetCentarAddToCartFunctionalityHomepage extends BaseHelper {
    WebDriver driver;

    public PetCentarAddToCartFunctionalityHomepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ctl53_Header1_CookiesEuBox_btnAcceptAll")
    WebElement popUpCookieButton;

    @FindBy(id = "ctl53_FilterHomepage1_RptFilters_ctl01_LnkFilterName")
    WebElement macke;

    @FindBy(id = "ctl53_FilterHomepage1_RptFilters_ctl01_RptFilter_ctl02_LnkFilter")
    WebElement kutakZaMacice;


    private void navigateToHomepage() {
        driver.get("https://www.pet-centar.rs");
    }

    private void closeCookieButton() {
        wdWait.until(ExpectedConditions.visibilityOf(popUpCookieButton));
        popUpCookieButton.click();
    }

    private void selectKutakZaMacice() {
        actions = new Actions(driver);
        actions.moveToElement(macke).perform();
        kutakZaMacice.click();
    }

    public void navigateToPetCentar(){
        navigateToHomepage();
        closeCookieButton();
        selectKutakZaMacice();

    }


}
