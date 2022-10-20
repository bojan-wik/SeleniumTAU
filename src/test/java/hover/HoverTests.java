package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTest {

    @Test
    public void verifyHoverOnFirstImage() {
        HoversPage hoversPage = homePage.clickHoversLink();
        HoversPage.ImageCaption imageCaptions = hoversPage.hoverOverImage(2);
        System.out.println(imageCaptions.getName());
        System.out.println(imageCaptions.getLinkText());
    }
}
