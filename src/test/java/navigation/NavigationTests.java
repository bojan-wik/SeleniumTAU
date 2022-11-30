package navigation;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;

public class NavigationTests extends BaseTest {

    @Test
    public void navigatorTest() {
        homePage.clickDynamicLoadingLink().clickExample1Link();
        windowManager.goBack();
        windowManager.refreshPage();
        windowManager.goForward();
        windowManager.goTo("https://www.google.com/");
    }

    @Test
    public void switchTabByTitleTest() {
        homePage.clickMultipleWindowsLink().clickClickHereLink();
        windowManager.switchToWindow( "title", "New Window");
    }

    @Test
    public void rightClickAndSwitchToTabByUrlTest() {
        homePage.clickDynamicLoadingLink().openLinkInNewTab("Example 2: Element rendered after the fact");
        windowManager.switchToWindow("url", "dynamic_loading/2");

        DynamicLoadingExample2Page dynamicLoadingExample2Page = new DynamicLoadingExample2Page(homePage.getDriver());
        Assert.assertTrue(dynamicLoadingExample2Page.isStartButtonDisplayed());
    }
}
