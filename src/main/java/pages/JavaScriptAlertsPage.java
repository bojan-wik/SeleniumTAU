package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JavaScriptAlertsPage extends BasePage {

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    private final By triggerAlertPopupButton = By.cssSelector("button[onclick='jsAlert()']");
    private final By triggerConfirmPopupButton = By.cssSelector("button[onclick='jsConfirm()']");
    private final By triggerPromptPopupButton = By.cssSelector("button[onclick='jsPrompt()']");
    private final By resultTextBox = By.id("result");

    public JavaScriptAlertsPage triggerAlertPopup() {
        getWait().until(ExpectedConditions.elementToBeClickable(triggerAlertPopupButton)).click();
        return new JavaScriptAlertsPage(getDriver());
    }

    public JavaScriptAlertsPage triggerConfirmPopup() {
        getWait().until(ExpectedConditions.elementToBeClickable(triggerConfirmPopupButton)).click();
        return new JavaScriptAlertsPage(getDriver());
    }

    public JavaScriptAlertsPage triggerPromptPopup() {
        getWait().until(ExpectedConditions.elementToBeClickable(triggerPromptPopupButton)).click();
        return new JavaScriptAlertsPage(getDriver());
    }

    public String getResultText() {
        return getDriver().findElement(resultTextBox).getText();
    }
}
