package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicLoadingExample2Page extends BasePage {

    public DynamicLoadingExample2Page(WebDriver driver) {
        super(driver);
    }

    private By startButton = By.cssSelector("#start > button");
    private By helloWorldBox = By.cssSelector("#finish h4");

    public boolean isStartButtonDisplayed() {
        return getDriver().findElement(startButton).isDisplayed();
    }

    public void clickStartButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(startButton)).click();
    }

    public String getHelloWorldText() {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(helloWorldBox)).getText();
    }
}
