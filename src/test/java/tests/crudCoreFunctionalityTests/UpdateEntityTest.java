package tests.crudCoreFunctionalityTests;

import coreFunctions.DriverSetup;
import coreFunctions.GlobalTestConditions;
import coreFunctions.TestEntityConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.AddNewComputerActions;
import pageActions.EditComputerActions;
import pageActions.MainPageActions;
import utils.TimeStamp;

public class UpdateEntityTest extends GlobalTestConditions {
    @Test
    public void updateEntityTest() {
        TestEntityConditions.createEntityAsPrecondition();
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Update entity test has started. ");
        mainPageActions.setSearchFieldValue("Test01");
        mainPageActions.clickFilterByNameButton();
        mainPageActions.clickOnEntityNameLink();
        AddNewComputerActions.fillComputerNameField("Test01_new");
        AddNewComputerActions.fillIntroducedDateField(TimeStamp.getTimeStampFormatted(1, "yyyy-MM-dd"));
        AddNewComputerActions.fillDiscontinuedDateField(TimeStamp.getTimeStampFormatted(2, "yyyy-MM-dd"));
        AddNewComputerActions.selectCompany(2);
        EditComputerActions.saveEntityChanges();

        Assert.assertEquals("Done! Computer Test01_new has been updated", mainPageActions.getAlertMessageTextShown());

        mainPageActions.setSearchFieldValue("Test01_new");
        mainPageActions.clickFilterByNameButton();
        mainPageActions.clickOnEntityNameLink();
        Assert.assertEquals("Test01_new", EditComputerActions.getEntityName());
        Assert.assertEquals(TimeStamp.getTimeStampFormatted(1, "yyyy-MM-dd"),
                EditComputerActions.getEntityIntroducedDate());
        Assert.assertEquals(TimeStamp.getTimeStampFormatted(2, "yyyy-MM-dd"),
                EditComputerActions.getEntityDiscontinuedDate());
        Assert.assertEquals("Thinking Machines", EditComputerActions.getEntityCompany());

        System.out.println("Update entity test has been completed. ");
        TestEntityConditions.deleteEntityAsPostCondition();
    }
}