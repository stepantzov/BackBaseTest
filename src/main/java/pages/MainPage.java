package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebElement;

public class MainPage extends ActionsSetup {
    public static WebElement addNewComputerBtn() {
        return getElement("//a[@class='btn success']", DELAY, XPATH);
    }

    public static WebElement filterByNameBtn() {
        return getElement("//input[@id='searchsubmit']", DELAY, XPATH);
    }

    public static WebElement searchFld() {
        return getElement("//input[@id='searchbox']", DELAY, XPATH);
    }
}