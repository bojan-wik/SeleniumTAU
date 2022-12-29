package cookies;

import base.BaseTest;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CookiesTests extends BaseTest {

    @Test
    public void addCookieTest() {
        Cookie cookie = cookieManager.buildCookie("topSecretCookie", "007");
        cookieManager.addCookie(cookie);
        Assert.assertTrue(cookieManager.isCookiePresent(cookie));
    }

    @Test
    public void deleteCookieTest() {
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%7D");
        cookieManager.deleteCookie(cookie);
        Assert.assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
    }
}
