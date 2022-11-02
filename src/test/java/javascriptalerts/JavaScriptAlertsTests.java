package javascriptalerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class JavaScriptAlertsTests extends BaseTest {

    @Test
    public void acceptAlertTest() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.triggerAlert().clickOkButtonOnJsAlert();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(), "You successfully clicked an alert",
                "Result text incorrect");
    }
}
