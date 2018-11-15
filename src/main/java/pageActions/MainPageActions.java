package pageActions;

import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class MainPageActions extends MainPage {
    protected static WebDriver driver;

    public MainPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickAddNewComputer(){
        elementClick(addNewComputerBtn());
    }

    public void setSearchFieldVal(String fieldValue) {
        sendKeys(searchFld(), fieldValue);
    }

    public void clickFilterByName(){
        elementClick(filterByNameBtn());
    }
}