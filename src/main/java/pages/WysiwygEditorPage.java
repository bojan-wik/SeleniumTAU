package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WysiwygEditorPage extends BasePage {

    public WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    private String editorIframeId = "mce_0_ifr";
    private By editorTextArea = By.id("tinymce");
    private By increaseIndentButton = By.cssSelector("button[title='Increase indent']");

    private void switchToEditorFrame() {
        getDriver().switchTo().frame(editorIframeId);
    }

    private void switchToMainFrame() {
        getDriver().switchTo().parentFrame();
    }

    public WysiwygEditorPage clickIncreaseIndentButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(increaseIndentButton)).click();
        return this;
    }

    public WysiwygEditorPage clearTextArea() {
        switchToEditorFrame();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(editorTextArea)).clear();
        switchToMainFrame();
        return this;
    }

    public WysiwygEditorPage setTextArea(String text) {
        switchToEditorFrame();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(editorTextArea)).sendKeys(text);
        switchToMainFrame();
        return this;
    }

    public String getTextFromEditor() {
        switchToEditorFrame();
        String text = getWait().until(ExpectedConditions.visibilityOfElementLocated(editorTextArea)).getText();
        switchToMainFrame();
        return text;
    }
}
