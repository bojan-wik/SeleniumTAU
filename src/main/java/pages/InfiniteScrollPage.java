package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage extends BasePage {

    private By paragraph = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        super(driver);
    }

    public void scrollToNthParagraph(int n) {
        String script =  "window.scrollTo(0, document.body.scrollHeight)";
        while (getNumberOfParagraphsPresent() < n) {
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberOfParagraphsPresent() {
        return getDriver().findElements(paragraph).size();
    }
}
