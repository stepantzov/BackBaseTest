package coreFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup extends GlobalDefinitions {
    public static WebDriver driverInstance = null;

    public static void initDriver(String url) {
        if (driverInstance == null) {
            System.out.println("Launching Google Chrome with new profile...");
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH + "chromedriver.exe");
            driverInstance = new ChromeDriver();
        }

        driverInstance.manage().window().maximize();
        driverInstance.navigate().to(url);
    }
}
