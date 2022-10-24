package keypresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeyPressesTests extends BaseTest {

    @Test
    public void backspaceTest() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void dollarCharTest() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterDollarChar();
    }
}
