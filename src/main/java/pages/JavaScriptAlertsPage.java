package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JavaScriptAlertsPage extends BasePage {

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    private By triggerAlertPopupButton = By.cssSelector("button[onclick='jsAlert()']");
    private By triggerConfirmPopupButton = By.cssSelector("button[onclick='jsConfirm()']");
    private By triggerPromptPopupButton = By.cssSelector("button[onclick='jsPrompt()']");
    private By resultTextBox = By.id("result");

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

    public void popup_clickToAccept() {
        getWait().until(ExpectedConditions.alertIsPresent()).accept();
//        getDriver().switchTo().alert().accept();
    }

    public void popup_clickToDismiss() {
        getWait().until(ExpectedConditions.alertIsPresent()).dismiss();
    }

    public String popup_getText() {
        return getWait().until(ExpectedConditions.alertIsPresent()).getText();
    }

    public JavaScriptAlertsPage popup_sendText(String text) {
        getWait().until(ExpectedConditions.alertIsPresent()).sendKeys(text);
        return this;
    }

    public String getResultText() {
        return getDriver().findElement(resultTextBox).getText();
    }
}
