package shiftingcontent;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MenuElementPage;
import pages.ShiftingContentPage;

public class ShiftingContentTests extends BaseTest {

    @Test
    void verifyNumberOfMenuElements() {
        ShiftingContentPage shiftingContentPage = homePage.clickShiftingContentLink();
        MenuElementPage menuElementPage = shiftingContentPage.clickExample1MenuElementLink();
        Assert.assertEquals(menuElementPage.getMenuElements().size(), 5);
    }
}
