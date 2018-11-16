package tests;

import coreFunctions.testSuiteBuilder.TestFullScopeSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestFullScopeSuiteRunner {
    public static void main(String[] args) {
        Result fullScopeTestsResult = JUnitCore.runClasses(TestFullScopeSuite.class);

        for (Failure failure : fullScopeTestsResult.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Test passed successfully: " + fullScopeTestsResult.wasSuccessful());
        System.out.format("Number of TC executed: %d; Number of Failures: %d",
                fullScopeTestsResult.getRunCount(), fullScopeTestsResult.getFailureCount());
    }
}