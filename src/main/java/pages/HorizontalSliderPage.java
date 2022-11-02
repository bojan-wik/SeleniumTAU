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

    /**
     * @param direction left or right
     */
    public void moveSlider(String direction, int numberOfSteps) {
        WebElement sliderElement = getDriver().findElement(slider);
        for (int i = 0; i < numberOfSteps; i++) {
            if (direction.equals("left")) {
                sliderElement.sendKeys(Keys.ARROW_LEFT);
            } else if (direction.equals("right")) {
                sliderElement.sendKeys(Keys.ARROW_RIGHT);
            } else {
                throw new IllegalArgumentException("Invalid direction argument");
            }
        }
    }

    public String getResult() {
        return getDriver().findElement(resultText).getText();
    }
}
