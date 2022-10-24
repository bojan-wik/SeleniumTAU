package horizontalSlider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends BaseTest {

    @Test
    public void test1() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderLink();
//        horizontalSliderPage.clickOnSlider();
        horizontalSliderPage.moveSlider("right");
        System.out.println(horizontalSliderPage.getResult());
    }
}
