package tests.edgeFunctionalityTests;

import coreFunctions.DriverSetup;
import coreFunctions.GlobalTestConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.AddNewComputerActions;
import pageActions.MainPageActions;

public class TestEntityValidation extends GlobalTestConditions {
    @Test
    public void verifyNameFieldValidationAppearedTest() {
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Verify If Validation On Name Field Appeared test has started. ");
        mainPageActions.clickAddNewComputer();
        AddNewComputerActions.clickCreateComputerButton();
        Assert.assertTrue("Validation is missing. ", AddNewComputerActions.verifyIfValidationAppear());

        System.out.println("Verify If Validation On Name Field Appeared test has been completed. ");
    }

    @Test
    public void verifyIntroducedDateValidationAppearedTest() {
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Verify If Validation On Introduced date Field Appeared test has started. ");
        mainPageActions.clickAddNewComputer();
        AddNewComputerActions.fillComputerNameField("Test01");
        AddNewComputerActions.fillIntroducedDateField("Test01");
        AddNewComputerActions.clickCreateComputerButton();
        Assert.assertTrue("Validation is missing. ", AddNewComputerActions.verifyIfValidationAppear());

        System.out.println("Verify If Validation On Introduced date Field Appeared test has been completed. ");
    }

    @Test
    public void verifyDiscontinuedDateValidationAppearedTest() {
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Verify If Validation On Introduced date Field Appeared test has started. ");
        mainPageActions.clickAddNewComputer();
        AddNewComputerActions.fillComputerNameField("Test01");
        AddNewComputerActions.fillDiscontinuedDateField("Test01");
        AddNewComputerActions.clickCreateComputerButton();
        Assert.assertTrue("Validation is missing. ", AddNewComputerActions.verifyIfValidationAppear());

        System.out.println("Verify If Validation On Introduced date Field Appeared test has been completed. ");
    }
}