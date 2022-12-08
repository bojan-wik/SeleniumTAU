package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private final static int EXPLICIT_WAIT_TIMEOUT = 20;

    // TODO: 21.11.2022 zmienić resztę private fieldów na protected (a la jsExecutor) i usunąć ich gettery
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;
    protected final JavascriptExecutor jsExecutor;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIMEOUT); // Setting explicit wait
        this.actions = new Actions(driver);
        this.jsExecutor = (JavascriptExecutor)driver;
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

    public void openLinkInNewTab(String linkText) {
        String clickLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText))).sendKeys(clickLink);
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
