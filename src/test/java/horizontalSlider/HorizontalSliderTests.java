package horizontalSlider;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends BaseTest {

    @Test
    public void moveSliderRightTest() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderLink();
        horizontalSliderPage.moveSlider("right", 8);
        Assert.assertEquals(horizontalSliderPage.getResult(), "4");
    }
}
