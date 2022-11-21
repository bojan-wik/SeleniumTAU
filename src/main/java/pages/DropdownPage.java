package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends BasePage {

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    private By dropdown = By.id("dropdown");

    private Select getDropdownElement() {
        return new Select(getDriver().findElement(dropdown));
    }

    public void selectOption(String option) {
        getDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = getDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(element -> element.getText()).collect(Collectors.toList());
    }

    public void addMultipleAttribute() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        String script = "document.querySelector('#dropdown').setAttribute('multiple', '')";
        jsExecutor.executeScript(script);
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#dropdown[multiple]")));
    }
}
