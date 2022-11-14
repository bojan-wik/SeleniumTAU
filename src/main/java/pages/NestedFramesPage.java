package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class NestedFramesPage extends BasePage {

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    private List<String> topPositions = new ArrayList<>(List.of("left", "middle", "right"));
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String middleFrame = "frame-middle";
    private String rightFrame = "frame-right";
    private String bottomFrame = "frame-bottom";
    private By frameBody = By.tagName("body");

    private void switchToFrame(String framePosition) {
        if (topPositions.contains(framePosition)) {
            getDriver().switchTo().frame(topFrame);
            switch (framePosition) {
                case "left":
                    getDriver().switchTo().frame(leftFrame);
                    break;
                case "middle":
                    getDriver().switchTo().frame(middleFrame);
                    break;
                case "right":
                    getDriver().switchTo().frame(rightFrame);
                    break;
            }
        } else {
            getDriver().switchTo().frame(bottomFrame);
        }
    }

    public String getTextFromFrame(String framePosition) {
        switchToFrame(framePosition);
        String text = getWait().until(ExpectedConditions.visibilityOfElementLocated(frameBody)).
                getText();
        switchToParentFrame();
        if (topPositions.contains(framePosition)) {
            switchToParentFrame();
        }
        return text;
    }
}
