package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    private By statusAlert = By.id("flash");

    public String getAlertText() {
        return getDriver().findElement(statusAlert).getText();
    }
}
