package pageActions;

import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class MainPageActions extends MainPage {
    protected static WebDriver driver;

    public MainPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickAddNewComputer() {
        elementClick(addNewComputerBtn());
    }

    public void setSearchFieldValue(String fieldValue) {
        searchFld().clear();
        sendKeys(searchFld(), fieldValue);
    }

    public void clickFilterByNameButton() {
        elementClick(filterByNameBtn());
    }

    public String getAlertMessageTextShown() {
        return alertMessageWarning().getText();
    }

    public String getEntityNameValueFromList() {
        return entityNameValueOnList().getText();
    }

    public void clickOnEntityNameLink() {
        entityNameValueOnList().click();
    }

    public String entityIntroducedValueFromList() {
        return entityIntroducedValueOnList().getText();
    }

    public String entityDiscontinuedValueFromList() {
        return entityDiscontinuedValueOnList().getText();
    }

    public String entityCompanyValueFromList() {
        return entityCompanyValueOnList().getText();
    }

    public void clearSearchField() {
        searchFld().clear();
    }

    public Boolean verifyNoComputerFound(){
        return noEntityFound().isDisplayed();
    }
}