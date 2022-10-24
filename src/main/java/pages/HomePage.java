package pages;

import org.openqa.selenium.WebDriver;

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

    public HorizontalSliderPage clickHorizontalSliderLink() {
        clickLink("Horizontal Slider");
        waitUntilUrlContains("horizontal_slider");
        return new HorizontalSliderPage(getDriver());
    }

    public HoversPage clickHoversLink() {
        clickLink("Hovers");
        waitUntilUrlContains("hovers");
        return new HoversPage(getDriver());
    }

    public KeyPressesPage clickKeyPressesLink() {
        clickLink("Key Presses");
        waitUntilUrlContains("key_presses");
        return new KeyPressesPage(getDriver());
    }

    public ShiftingContentPage clickShiftingContentLink() {
        clickLink("Shifting Content");
        waitUntilUrlContains("shifting_content");
        return new ShiftingContentPage(getDriver());
    }
}
