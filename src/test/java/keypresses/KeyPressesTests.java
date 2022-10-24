package keypresses;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeyPressesTests extends BaseTest {

    @Test
    public void test1() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.pressKeyR();

        System.out.println(keyPressesPage.getResult());
        Assert.assertEquals(keyPressesPage.getResult(), "You entered: R");

        keyPressesPage.pressKeyBackspace();
        System.out.println(keyPressesPage.getResult());
        Assert.assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE");
    }
}
