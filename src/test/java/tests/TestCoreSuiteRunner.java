package tests;

import coreFunctions.testSuiteBuilder.TestCoreSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCoreSuiteRunner {
    public static void main(String[] args) {
        Result coreTestsResult = JUnitCore.runClasses(TestCoreSuite.class);

        for (Failure failure : coreTestsResult.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Test passed successfully: " + coreTestsResult.wasSuccessful());
        System.out.format("Number of TC executed: %d; Number of Failures: %d",
                coreTestsResult.getRunCount(), coreTestsResult.getFailureCount());
    }
}