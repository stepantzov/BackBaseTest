package coreFunctions.testSuiteBuilder;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.edgeFunctionalityTests.TestEntityValidation;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestEntityValidation.class
})

public class TestEdgeCasesSuite {
}