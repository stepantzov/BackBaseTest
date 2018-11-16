package tests;

import coreFunctions.testSuiteBuilder.TestEdgeCasesSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestEdgeCasesSuiteRunner {
    public static void main(String[] args) {
        Result edgeTestsResult = JUnitCore.runClasses(TestEdgeCasesSuite.class);

        for (Failure failure : edgeTestsResult.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Test passed successfully: " + edgeTestsResult.wasSuccessful());
        System.out.format("Number of TC executed: %d; Number of Failures: %d",
                edgeTestsResult.getRunCount(), edgeTestsResult.getFailureCount());
    }
}