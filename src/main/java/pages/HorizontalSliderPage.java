package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    private By slider = By.cssSelector("input[type='range']");
    private By resultText = By.id("range");

    public HorizontalSliderPage clickOnSlider() {
        getDriver().findElement(slider).click();
        return this;
    }

    /**
      * @param direction left or right
     */
    public void moveSlider(String direction) {
        WebElement sliderElement = getDriver().findElement(slider);
        switch (direction) {
            case "left":
                System.out.println("moving slider left");
                break;
            case "right":
                sliderElement.sendKeys(Keys.ARROW_RIGHT);
                sliderElement.sendKeys(Keys.ARROW_RIGHT);
                break;
            default:
                throw new IllegalStateException("No such option in the switch statement");
        }
    }

    public String getResult() {
        return getDriver().findElement(resultText).getText();
    }
}
