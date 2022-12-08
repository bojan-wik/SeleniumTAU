package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private final By box = By.id("hot-spot");

    public void rightClickInBox() {
        getWait().until(ExpectedConditions.elementToBeClickable(box));
        getActions().contextClick(getDriver().findElement(box)).perform();
    }
}
