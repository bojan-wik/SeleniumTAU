package pages;

import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage extends BasePage {

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    public void clickClickHereLink() {
        clickLink("Click Here");
    }
}
