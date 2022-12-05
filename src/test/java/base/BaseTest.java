package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.BrowserGetter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
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

    @AfterMethod
    public void takeScreenshotIfTestFails(ITestResult result) {
        if (!result.isSuccess()) {
            TakesScreenshot camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("screenshots/" + result.getName() + ".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
