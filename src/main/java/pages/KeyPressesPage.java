package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage {

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    private By inputForm = By.id("target");
    private By resultBox = By.id("result");

    public void pressKeyR() {
        getDriver().findElement(inputForm).sendKeys("r");
    }

    public void pressKeyBackspace() {
        getDriver().findElement(inputForm).sendKeys(Keys.BACK_SPACE);
    }

    public String getResult() {
        return getDriver().findElement(resultBox).getText();
    }
}
