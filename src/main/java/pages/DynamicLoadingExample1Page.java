package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample1Page extends BasePage {

    public DynamicLoadingExample1Page(WebDriver driver) {
        super(driver);
    }

    private By startButton = By.cssSelector("#start button");
    private By helloWorldBox = By.cssSelector("#finish h4");

    // EXPLICIT WAIT
    public void clickStartButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(startButton)).click();
    }

    // FLUENT WAIT
//    public void clickStartButton() {
//        FluentWait<WebDriver> fluentWait = new FluentWait<>(getDriver()).
//                withTimeout(Duration.ofSeconds(5)).
//                pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
//        fluentWait.until(ExpectedConditions.elementToBeClickable(startButton));
//        getDriver().findElement(startButton).click();
//    }

    public String getHelloWorldText() {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(helloWorldBox)).getText();
    }
}
