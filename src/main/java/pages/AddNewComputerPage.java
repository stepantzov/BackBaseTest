package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddNewComputerPage extends ActionsSetup {
    public static WebElement computerNameFld() {
        return getElement("//input[@id='name']", DELAY, XPATH);
    }

    public static WebElement introducedDateFld() {
        return getElement("//input[@id='introduced']", DELAY, XPATH);
    }

    public static WebElement discontinuedDateFld() {
        return getElement("//input[@id='discontinued']", DELAY, XPATH);
    }

    public static Select companyDropdown(){
        return new Select(getElement("//select[@id='company']", DELAY, XPATH));
    }

    public static WebElement createThisComputerBtn(){
        return getElement("//div[@class='actions']//input[@type='submit']", DELAY, XPATH);
    }

    public static WebElement cancelBtn(){
        return getElement("//a[text()='Cancel']", DELAY, XPATH);
    }
}