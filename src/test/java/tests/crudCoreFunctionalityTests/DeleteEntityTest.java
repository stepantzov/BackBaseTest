package tests.crudCoreFunctionalityTests;

import coreFunctions.DriverSetup;
import coreFunctions.GlobalTestConditions;
import coreFunctions.TestEntityConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.EditComputerActions;
import pageActions.MainPageActions;

public class DeleteEntityTest extends GlobalTestConditions {
    @Test
    public void deleteComputerTest() {
        TestEntityConditions.createEntityAsPrecondition();
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Test Delete Computer Entity has started. ");
        mainPageActions.clearSearchField();
        mainPageActions.setSearchFieldValue("Test01");
        mainPageActions.clickFilterByNameButton();
        mainPageActions.clickOnEntityNameLink();
        EditComputerActions.deleteEntity();
        Assert.assertEquals("Done! Computer has been deleted", mainPageActions.getAlertMessageTextShown());

        mainPageActions.setSearchFieldValue("Test01");
        mainPageActions.clickFilterByNameButton();
        Assert.assertTrue("Entity is present on search results. ", mainPageActions.verifyNoComputerFound());

        System.out.println("Test Delete Computer Entity has been completed. ");
    }
}