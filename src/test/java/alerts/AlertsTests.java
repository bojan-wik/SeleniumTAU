package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class AlertsTests extends BaseTest {

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

    @Test
    public void enterTextInPromptPopupTest() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();
        String text = "dupa dupa dupa";
        javaScriptAlertsPage.triggerPromptPopup().popup_sendText(text);
        javaScriptAlertsPage.popup_clickToAccept();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(), "You entered: " + text,
                "Result text incorrect");
    }
}
