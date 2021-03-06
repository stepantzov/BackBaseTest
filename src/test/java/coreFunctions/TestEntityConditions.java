package coreFunctions;

import pageActions.AddNewComputerActions;
import pageActions.EditComputerActions;
import pageActions.MainPageActions;
import utils.TimeStamp;

import static coreFunctions.DriverSetup.driverInstance;
import static coreFunctions.GlobalDefinitions.URL;

public class TestEntityConditions {
    public static void deleteEntityAsPostCondition() {
        driverInstance.navigate().to(URL);
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Deleting computer entity. ");
        mainPageActions.setSearchFieldValue("Test01");
        mainPageActions.clickFilterByNameButton();
        mainPageActions.clickOnEntityNameLink();

        EditComputerActions.deleteEntity();
        System.out.println("Entity deleted. \n");
    }

    public static void createEntityAsPrecondition() {
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Creating new Computer entity. ");
        mainPageActions.clickAddNewComputer();

        AddNewComputerActions.fillComputerNameField("Test01");
        AddNewComputerActions.fillIntroducedDateField(TimeStamp.getTimeStampFormatted(0, "yyyy-MM-dd"));
        AddNewComputerActions.fillDiscontinuedDateField(TimeStamp.getTimeStampFormatted(1, "yyyy-MM-dd"));
        AddNewComputerActions.selectCompany(1);
        AddNewComputerActions.clickCreateComputerButton();

        System.out.println("Entity created. \n");
    }
}