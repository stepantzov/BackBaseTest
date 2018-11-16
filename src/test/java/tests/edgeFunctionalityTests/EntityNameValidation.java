package tests.edgeFunctionalityTests;

import coreFunctions.DriverSetup;
import coreFunctions.GlobalTestConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.AddNewComputerActions;
import pageActions.MainPageActions;

public class EntityNameValidation extends GlobalTestConditions {
    @Test
    public void verifyIfValidationOnNameFieldAppeared() {
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Verify If Validation On Name Field Appeared test has started. ");
        mainPageActions.clickAddNewComputer();
        AddNewComputerActions.clickCreateComputerButton();
        Assert.assertTrue("Validation is missing. ", AddNewComputerActions.verifyIfNameValidationAppear());

    }
}

