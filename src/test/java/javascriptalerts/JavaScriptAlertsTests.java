package javascriptalerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class JavaScriptAlertsTests extends BaseTest {

    @Test
    public void acceptAlertPopupTest() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.triggerAlertPopup().popup_clickToAccept();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(), "You successfully clicked an alert",
                "Result text incorrect");
    }

    @Test
    public void getTextFromConfirmPopupTest() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.triggerConfirmPopup();
        Assert.assertEquals(javaScriptAlertsPage.popup_getText(), "I am a JS Confirm",
                "Confirm popup text incorrect");
        javaScriptAlertsPage.popup_clickToDismiss();
    }
}
