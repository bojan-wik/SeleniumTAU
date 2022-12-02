package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserGetter {

    private final static String CHROMEDRIVER_FILE_PATH = "src/test/resources/webdrivers/chromedriver.exe";
    private final static String EDGEDRIVER_FILE_PATH = "src/test/resources/webdrivers/msedgedriver.exe";

    public WebDriver getWebDriverViaParameter() {
        String browser = System.getProperty("browser").toLowerCase();
        System.out.println("Running tests in browser: " + browser);
        return getWebDriver(browser);
    }

    /**
     *
     * @param browser 'chrome' or 'edge'
     * @return browser-specific webdriver object
     */
    private WebDriver getWebDriver(String browser) {
        WebDriver driver;

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_FILE_PATH);
                driver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", EDGEDRIVER_FILE_PATH);
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Options allowed: 'chrome' or 'edge'");
        }

        driver.manage().window().maximize();
        return driver;
    }
}
