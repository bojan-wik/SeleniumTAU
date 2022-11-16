package pages;

import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePage {

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DynamicLoadingExample1Page clickExample1Link() {
        clickLink("Example 1: Element on page that is hidden");
        waitUntilUrlContains("dynamic_loading/1");
        return new DynamicLoadingExample1Page(getDriver());
    }
}
