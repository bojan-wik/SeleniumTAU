package javascript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDom;

public class JavaScriptTests extends BaseTest {

    @Test
    public void scrollToTableTest() {
        LargeAndDeepDom largeAndDeepDom = homePage.clickLargeAndDeepDomLink();
        largeAndDeepDom.scrollToTable();
    }

    @Test
    public void infiniteScrollTest() {
        homePage.clickInfiniteScrollLink().scrollToNthParagraph(5);
    }
}
