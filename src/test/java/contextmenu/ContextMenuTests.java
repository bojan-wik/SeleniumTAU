package contextmenu;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTest {

    @Test
    public void rightClickInBoxAndVerifyPopupTextTest() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.rightClickInBox();
        Assert.assertEquals(contextMenuPage.popup_getText(), "You selected a context menu",
                "Popup text incorrect");
        contextMenuPage.popup_clickToAccept();
    }
}
