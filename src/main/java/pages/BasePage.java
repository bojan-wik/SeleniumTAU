package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private final static int TIMEOUT = 15;

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIMEOUT);
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

    public void clickLink(String linkText) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)))
                .click();
    }

    public void waitUntilUrlContains(String fraction) {
        getWait().until(ExpectedConditions.urlContains(fraction));
    }
}
