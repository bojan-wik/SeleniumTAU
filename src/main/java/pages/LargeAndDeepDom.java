package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDom extends BasePage {

    private By table = By.id("large-table");

    public LargeAndDeepDom(WebDriver driver) {
        super(driver);
    }

    public void scrollToTable() {
        WebElement tableElement = getDriver().findElement(table);
        String script = "arguments[0].scrollIntoView();";
        jsExecutor.executeScript(script, tableElement);
    }
}
