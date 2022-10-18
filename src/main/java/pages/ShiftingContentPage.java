package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShiftingContentPage extends BasePage {

    public ShiftingContentPage(WebDriver driver) {
        super(driver);
    }

    private By example1Link = By.cssSelector("div#content a[href='/shifting_content/menu']");

    public void clickOnExample1Link() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(example1Link))
                .click();
    }
}
