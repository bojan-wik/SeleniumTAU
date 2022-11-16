package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;

public class WaitTests extends BaseTest {

    @Test
    public void waitUntilHiddenTest() {
        DynamicLoadingExample1Page dynamicLoadingExample1Page = homePage.clickDynamicLoadingLink().clickExample1Link();
        dynamicLoadingExample1Page.clickStartButton();

        Assert.assertEquals(dynamicLoadingExample1Page.getHelloWorldText(), "Hello World!",
                "Text incorrect");
    }
}
