package tests;

import coreFunctions.testSuiteBuilder.TestCoreSuite;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCoreSuiteRunner {
    public static void main(String[] args) {
        Result coreTestsResult = JUnitCore.runClasses(TestCoreSuite.class);

        for (Failure failure : coreTestsResult.getFailures()) {
            System.out.println(failure.toString());
        }

        Assert.assertTrue("Core Functionality test suite completed with failure. ", coreTestsResult.wasSuccessful());
    }
}