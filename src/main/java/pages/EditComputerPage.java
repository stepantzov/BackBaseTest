package pages;

import org.openqa.selenium.WebElement;

public class EditComputerPage extends AddNewComputerPage {
    public static WebElement deleteComputer() {
        return getElement("//*[@class='btn danger']", DELAY, XPATH);
    }
}
