package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public DropdownPage clickDropdownLink() {
        clickLink("Dropdown");
        waitUntilUrlContains("dropdown");
        return new DropdownPage(getDriver());
    }

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        waitUntilUrlContains("login");
        return new LoginPage(getDriver());
    }

//    public HoversPage clickHoversLink() {
//        clickLink("Hovers");
//        waitUntilUrlContains("hovers");
//        return new HoversPage(getDriver());
//    }

    public ShiftingContentPage clickShiftingContentLink() {
        clickLink("Shifting Content");
        waitUntilUrlContains("shifting_content");
        return new ShiftingContentPage(getDriver());
    }
}
