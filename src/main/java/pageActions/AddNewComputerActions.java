package pageActions;

import org.openqa.selenium.WebDriver;
import pages.AddNewComputerPage;

public class AddNewComputerActions extends AddNewComputerPage {
    protected static WebDriver driver;

    public AddNewComputerActions(WebDriver driver) {
        this.driver = driver;
    }

    public static void fillComputerNameField(String computerName){
        computerNameFld().clear();
        sendKeys(computerNameFld(), computerName);
    }

    public static void fillIntroducedDateField(String introducedDate){
        introducedDateFld().clear();
        sendKeys(introducedDateFld(), introducedDate);
    }

    public static void fillDiscontinuedDateField(String discontinuedDate){
        discontinuedDateFld().clear();
        sendKeys(discontinuedDateFld(), discontinuedDate);
    }

    public static void selectCompany(int index){
        companyDropdown().selectByIndex(index);
    }

    public static void clickCreateComputerButton(){
        elementClick(createThisComputerBtn());
    }

    public static void clickCancelButton(){
        elementClick(cancelBtn());
    }
}