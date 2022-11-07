package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WysiwygEditorPage extends BasePage {

    public WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    private String editorIframeId = "mce_0_ifr";
    private By editorTextArea = By.id("tinymce");
    private By increaseIndentButton = By.cssSelector("button[title='Increase indent']");

    public void clearTextArea() {
        switchToEditor();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(editorTextArea)).clear();

    }

    private void switchToEditor() {
        getDriver().switchTo().frame(editorIframeId);
    }

    public void clearEditorAndSetText(String text) {
//        switchToEditor();
        clearTextArea();
        // TODO: 5:45
        WebElement editorElement = getDriver().findElement(editorTextArea);
//        getWait().until(ExpectedConditions.visibilityOf(editorElement)).clear();
        editorElement.sendKeys("hello ");

        getDriver().switchTo().parentFrame();
        getWait().until(ExpectedConditions.elementToBeClickable(increaseIndentButton)).click();

        switchToEditor();
        editorElement.sendKeys("world");
    }
}
