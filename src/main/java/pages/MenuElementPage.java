package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuElementPage extends BasePage {

    public MenuElementPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getMenuElements() {
        return getDriver().findElements(By.cssSelector("#content li a"));
    }
}
