package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JavaScriptAlertsPage extends BasePage {

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    private By triggerAlertButton = By.cssSelector("button[onclick='jsAlert()']");
    private By resultTextBox = By.id("result");

    public JavaScriptAlertsPage triggerAlert() {
        getWait().until(ExpectedConditions.elementToBeClickable(triggerAlertButton)).click();
        return new JavaScriptAlertsPage(getDriver());
    }

    public void clickOkButtonOnJsAlert() {
        getWait().until(ExpectedConditions.alertIsPresent()).accept();
//        getDriver().switchTo().alert().accept();
    }

    public String getResultText() {
        return getDriver().findElement(resultTextBox).getText();
    }
}
