package hover;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTest {

    @Test
    public void hoverUser1Test() {
        HoversPage hoversPage = homePage.clickHoversLink();
        HoversPage.ImageCaption imageCaption = hoversPage.hoverOverImage(1);
        Assert.assertTrue(imageCaption.isCaptionDisplayed(), "Caption is not displayed");
        Assert.assertEquals(imageCaption.getTitle(), "name: user1", "Caption title is incorrect");
        Assert.assertEquals(imageCaption.getLinkText(), "View profile", "Link text is incorrect");
        Assert.assertTrue(imageCaption.getLink().endsWith("/users/1"), "Link is incorrect");
    }
}
