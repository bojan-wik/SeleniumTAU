package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public DropdownPage clickDropdownLink() {
        clickLink("Dropdown");
        getWait().until(ExpectedConditions.urlContains("dropdown"));
        return new DropdownPage(getDriver());
    }

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        getWait().until(ExpectedConditions.urlContains("login"));
        return new LoginPage(getDriver());
    }

    public ShiftingContentPage clickShiftingContentLink() {
        clickLink("Shifting Content");
        getWait().until(ExpectedConditions.urlContains("shifting_content"));
        return new ShiftingContentPage(getDriver());
    }
}
