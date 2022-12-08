package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage {

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    private final By inputField = By.id("target");
    private final By resultBox = By.id("result");

    public void enterText(String text) {
        getDriver().findElement(inputField).sendKeys(text);
    }

    public void enterDollarChar() {
        enterText(Keys.chord(Keys.SHIFT, "4") + " = 4,87 PLN");
    }

    public String getResult() {
        return getDriver().findElement(resultBox).getText();
    }
}
