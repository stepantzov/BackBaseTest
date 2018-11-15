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

    public static WebElement alertMessageWarning() {
        return getElement("//div[@class='alert-message warning']", DELAY, XPATH);
    }

    public static WebElement entityNameValueOnList() {
        return getElement("//tbody//a[starts-with(@href, '/computers/')]", DELAY, XPATH);
    }

    public static WebElement entityIntroducedValueOnList() {
        return getElement("//*[@class='computers zebra-striped']//td[2]", DELAY, XPATH);
    }

    public static WebElement entityDiscontinuedValueOnList() {
        return getElement("//*[@class='computers zebra-striped']//td[3]", DELAY, XPATH);
    }

    public static WebElement entityCompanyValueOnList() {
        return getElement("//*[@class='computers zebra-striped']//td[4]", DELAY, XPATH);
    }
}