package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {

    @Test
    void successfulLoginTest() {
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setCredentials("Username", "tomsmith")
                .setCredentials("Password", "SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getAlertText()
                .contains("You logged into a secure area"),
                "Alert text is incorrect");
    }
}
