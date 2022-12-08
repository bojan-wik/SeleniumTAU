package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By loginFailedMessage = By.id("flash");

    public LoginPage setCredentials(String fieldName, String input) {
        switch(fieldName) {
            case "Username":
                getDriver().findElement(usernameField).sendKeys(input);
                break;
            case "Password":
                getDriver().findElement(passwordField).sendKeys(input);
                break;
            default:
                throw new IllegalStateException("No such option in the switch statement");
        }
        return this;
    }

    public SecureAreaPage clickLoginButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return new SecureAreaPage(getDriver());
    }
}
