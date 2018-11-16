package pageActions;

import org.openqa.selenium.WebDriver;
import pages.EditComputerPage;

public class EditComputerActions extends EditComputerPage {
    protected static WebDriver driver;

    public EditComputerActions(WebDriver driver) {
        this.driver = driver;
    }

    public static String getEntityName() {
        return computerNameFld().getAttribute("value");
    }

    public static String getEntityIntroducedDate() {
        return introducedDateFld().getAttribute("value");
    }

    public static String getEntityDiscontinuedDate() {
        return discontinuedDateFld().getAttribute("value");
    }

    public static String getEntityCompany() {
        return companyDropdown().getFirstSelectedOption().getText();
    }

    public static void saveEntityChanges() {
        elementClick(createThisComputerBtn());
    }

    public static void deleteEntity(){
        elementClick(deleteComputer());
    }
}
