package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.BrowserGetter;
import utils.WindowManager;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private final static int IMPLICIT_WAIT_TIMEOUT = 5;

    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;
    protected HomePage homePage;
    protected WindowManager windowManager;

    @BeforeClass
    public void setUp() {
        driver = browserGetter.getWebDriverViaParameter();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS); // Setting implicit wait
        goHome();
        homePage = new HomePage(driver);
        windowManager = new WindowManager(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
