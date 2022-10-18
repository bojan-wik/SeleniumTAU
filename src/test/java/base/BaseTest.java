package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Webdrivers\\Chrome\\106\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

//    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
