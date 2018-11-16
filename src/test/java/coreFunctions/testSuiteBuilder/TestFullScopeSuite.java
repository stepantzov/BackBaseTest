package coreFunctions.testSuiteBuilder;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.crudCoreFunctionalityTests.CreateEntityTest;
import tests.crudCoreFunctionalityTests.DeleteEntityTest;
import tests.crudCoreFunctionalityTests.SearchEntryTest;
import tests.crudCoreFunctionalityTests.UpdateEntityTest;
import tests.edgeFunctionalityTests.TestEntityValidation;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestEntityValidation.class,
        CreateEntityTest.class,
        DeleteEntityTest.class,
        SearchEntryTest.class,
        UpdateEntityTest.class
})

public class TestFullScopeSuite {
}