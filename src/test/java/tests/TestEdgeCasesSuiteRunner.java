package tests;

import coreFunctions.testSuiteBuilder.TestEdgeCasesSuite;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestEdgeCasesSuiteRunner {
    public static void main(String[] args) {
        Result coreTestsResult = JUnitCore.runClasses(TestEdgeCasesSuite.class);

        for (Failure failure : coreTestsResult.getFailures()) {
            System.out.println(failure.toString());
        }

        Assert.assertTrue("Edge Functionality test suite completed with failure. ", coreTestsResult.wasSuccessful());
    }
}