package tests.crudCoreTests;

import coreFunctions.DriverSetup;
import coreFunctions.GlobalTestConditions;
import coreFunctions.TestConditionsActions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.EditComputerActions;
import pageActions.MainPageActions;
import utils.TimeStamp;

public class SearchEntry extends GlobalTestConditions {
    @Test
    public void searchForEntityAndVerifyResults() {
        TestConditionsActions.createEntityAsPrecondition();
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Search for created entity test has started. ");
        mainPageActions.clearSearchField();
        mainPageActions.setSearchFieldValue("Test01");
        mainPageActions.clickFilterByNameButton();

        Assert.assertEquals("Test01", mainPageActions.getEntityNameValueFromList());
        Assert.assertEquals(TimeStamp.getTimeStampFormatted(0, "dd MMM yyy"),
                mainPageActions.entityIntroducedValueFromList());
        Assert.assertEquals(TimeStamp.getTimeStampFormatted(1, "dd MMM yyy"),
                mainPageActions.entityDiscontinuedValueFromList());
        Assert.assertEquals("Apple Inc.", mainPageActions.entityCompanyValueFromList());

        System.out.println("Search for created entity test has been completed. ");
        TestConditionsActions.deleteEntityAsPostCondition();
    }

    @Test
    public void searchForCreatedEntityAndOpenDetails() {
        TestConditionsActions.createEntityAsPrecondition();
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Search for created entity and verify details Test has started. ");
        mainPageActions.setSearchFieldValue("Test01");
        mainPageActions.clickFilterByNameButton();
        mainPageActions.clickOnEntityNameLink();

        Assert.assertEquals("Test01", EditComputerActions.getEntityName());
        Assert.assertEquals(TimeStamp.getTimeStampFormatted(0, "yyyy-MM-dd"),
                EditComputerActions.getEntityIntroducedDate());
        Assert.assertEquals(TimeStamp.getTimeStampFormatted(1, "yyyy-MM-dd"),
                EditComputerActions.getEntityDiscontinuedDate());
        Assert.assertEquals("Apple Inc.", EditComputerActions.getEntityCompany());

        System.out.println("Search for created entity and verify details Test has been completed. ");
        TestConditionsActions.deleteEntityAsPostCondition();
    }
}