package coreFunctions.testSuiteBuilder;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.crudCoreFunctionalityTests.CreateEntityTest;
import tests.crudCoreFunctionalityTests.DeleteEntityTest;
import tests.crudCoreFunctionalityTests.SearchEntryTest;
import tests.crudCoreFunctionalityTests.UpdateEntityTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CreateEntityTest.class,
        DeleteEntityTest.class,
        SearchEntryTest.class,
        UpdateEntityTest.class
})
public class TestCoreSuite {
}