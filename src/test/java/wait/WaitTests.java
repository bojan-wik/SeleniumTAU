package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;

public class WaitTests extends BaseTest {

    @Test
    public void waitUntilHiddenTest() {
        DynamicLoadingExample1Page dynamicLoadingExample1Page = homePage.clickDynamicLoadingLink().clickExample1Link();
        dynamicLoadingExample1Page.clickStartButton();

        Assert.assertEquals(dynamicLoadingExample1Page.getHelloWorldText(), "Hello World!",
                "Text incorrect");
    }

    @Test
    public void waitUntilRenderedTest() {
        DynamicLoadingExample2Page dynamicLoadingExample2Page = homePage.clickDynamicLoadingLink().clickExample2Link();
        dynamicLoadingExample2Page.clickStartButton();

        Assert.assertEquals(dynamicLoadingExample2Page.getHelloWorldText(), "Hello World!",
                "Text incorrect");
    }
}
