package tests.crudCoreTests;

import coreFunctions.DriverSetup;
import coreFunctions.GlobalTestConditions;
import coreFunctions.TestEntityConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.AddNewComputerActions;
import pageActions.MainPageActions;
import utils.TimeStamp;

public class CreateEntity extends GlobalTestConditions {
    @Test
    public void createNewComputerEntry() {
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Create New Computer entity test has started. ");
        mainPageActions.clickAddNewComputer();
        AddNewComputerActions.fillComputerNameField("Test01");
        AddNewComputerActions.fillIntroducedDateField(TimeStamp.getTimeStampFormatted(0, "yyyy-MM-dd"));
        AddNewComputerActions.fillDiscontinuedDateField(TimeStamp.getTimeStampFormatted(1, "yyyy-MM-dd"));
        AddNewComputerActions.selectCompany(1);
        AddNewComputerActions.clickCreateComputerButton();
        Assert.assertEquals("Done! Computer Test01 has been created", mainPageActions.getAlertMessageTextShown());

        System.out.println("Create New Computer entity test has been completed. ");
        TestEntityConditions.deleteEntityAsPostCondition();
    }
}