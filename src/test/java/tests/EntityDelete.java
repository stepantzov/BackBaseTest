package tests;

import coreFunctions.DriverSetup;
import coreFunctions.GlobalTestConditions;
import coreFunctions.TestConditionsActions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.EditComputerActions;
import pageActions.MainPageActions;

public class EntityDelete extends GlobalTestConditions {
    @Test
    public void deleteComputer() {
        TestConditionsActions.createEntityAsPrecondition();
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Test Delete Computer Entity has started. ");
        mainPageActions.clearSearchField();
        mainPageActions.setSearchFieldValue("Test01");
        mainPageActions.clickFilterByNameButton();
        mainPageActions.clickOnEntityNameLink();
        EditComputerActions.deleteEntity();
        Assert.assertEquals("Done! Computer has been deleted", mainPageActions.getAlertMessageTextShown());

        System.out.println("Test Delete Computer Entity has been completed. ");
    }
}