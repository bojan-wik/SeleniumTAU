package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FileUploadPage extends BasePage {

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    private final By fileUploadInput = By.id("file-upload");
    private final By fileSubmitButton = By.id("file-submit");
    private final By uploadedFilesResult = By.id("uploaded-files");

    /**
     * @param filePath The absolute path of the file to upload
     */
    public FileUploadPage uploadFile(String filePath) {
        getWait().until(ExpectedConditions.elementToBeClickable(fileUploadInput)).sendKeys(filePath);
        return this;
    }

    public void clickFileSubmitButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(fileSubmitButton)).click();
    }

    public String getUploadedFilesResult() {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(uploadedFilesResult)).getText();
    }
}
