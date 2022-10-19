package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShiftingContentPage extends BasePage {

    public ShiftingContentPage(WebDriver driver) {
        super(driver);
    }

    public MenuElementPage clickExample1MenuElementLink() {
        clickLink("Example 1: Menu Element");
        getWait().until(ExpectedConditions.urlContains("shifting_content/menu"));
        return new MenuElementPage(getDriver());
    }
}
