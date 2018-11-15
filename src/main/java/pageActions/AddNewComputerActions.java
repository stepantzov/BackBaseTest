package pageActions;

import org.openqa.selenium.WebDriver;
import pages.AddNewComputerPage;

public class AddNewComputerActions extends AddNewComputerPage {
    protected static WebDriver driver;

    public AddNewComputerActions(WebDriver driver) {
        this.driver = driver;
    }

    public static void fillComputerNameField(String computerName){
        sendKeys(computerNameFld(), computerName);
    }

    public static void fillIntroducedDateField(String introducedDate){
        sendKeys(introducedDateFld(), introducedDate);
    }

    public static void fillDiscontinuedDateField(String discontinuedDate){
        sendKeys(introducedDateFld(), discontinuedDate);
    }

    public static void selectCompany(){
        companyDropdown().selectByIndex(1);
    }

    public static void clickCreateComputerButton(){
        elementClick(createThisComputerBtn());
    }

    public static void clickCancelButton(){
        elementClick(cancelBtn());
    }
}