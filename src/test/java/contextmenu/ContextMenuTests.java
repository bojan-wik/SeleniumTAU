package contextmenu;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTest {

    @Test
    public void test1() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.rightClickInBox();
    }
}
