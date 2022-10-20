package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    private By imageBox = By.className("figure");
    private By imageCaptionBox = By.className("figcaption");

    /**
     * @param index value in the range 1-3
     */
    public ImageCaption hoverOverImage(int index) {
        if (index < 1 || index > 3) {
            throw new IllegalArgumentException("index value must be in the range 1-3");
        }
        WebElement image = getDriver().findElements(imageBox).get(index - 1);
        getActions().moveToElement(image).perform();
        return new ImageCaption(image.findElement(imageCaptionBox));
    }

    public class ImageCaption {

        private WebElement caption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");

        public ImageCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getName() {
            return caption.findElement(name).getText();
        }

        public String getLink() {
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText() {
            return caption.findElement(link).getText();
        }
    }
}
