package pages;

import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public NestedFramesPage clickNestedFramesLink() {
        clickLink("Nested Frames");
        waitUntilUrlContains("nested_frames");
        return new NestedFramesPage(getDriver());
    }
}
