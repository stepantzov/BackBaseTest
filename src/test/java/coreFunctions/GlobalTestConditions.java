package coreFunctions;

import org.junit.After;
import org.junit.Before;

public class GlobalTestConditions extends DriverSetup {
    @Before
    public void initializeTestBaseSetup() {
        try {
            DriverSetup.initDriver(URL);
        } catch (Exception e) {
            System.out.println("Error... " + e.getStackTrace());
        }
    }

    @After
    public void tearDown() {
        System.out.println("Closing browser. ");
        driverInstance.quit();
        driverInstance = null;
    }
}