package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private void clickLink(String linkText) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)))
                .click();
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
}
