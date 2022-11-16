package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private final static int EXPLICIT_WAIT_TIMEOUT = 20;

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIMEOUT); // Setting explicit wait
        this.actions = new Actions(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public Actions getActions() {
        return actions;
    }

    // generic actions

    public void clickLink(String linkText) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)))
                .click();
    }

    public void switchToParentFrame() {
        getDriver().switchTo().parentFrame();
    }

    public void waitUntilUrlContains(String fraction) {
        getWait().until(ExpectedConditions.urlContains(fraction));
    }

    // popup/alert generic actions

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

    public void popup_sendText(String text) {
        getWait().until(ExpectedConditions.alertIsPresent()).sendKeys(text);
    }
}
