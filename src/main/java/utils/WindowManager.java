package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        this.navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

    /**
     * Switching to currently opened window or tab
     * @param windowTitle Expected window or tab title
     */
    public void switchToWindow(String windowTitle) {
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Number of opened windows/tabs: " + windowHandles.size());

        System.out.println("Window handles: ");
        windowHandles.forEach(windowHandle -> System.out.println(windowHandle));

        for (String windowHandle : windowHandles) {
            System.out.println("Switching to window: " + windowHandle);
            driver.switchTo().window(windowHandle);

            String currentWindowTitle = driver.getTitle();
            System.out.println("Current window title: " + currentWindowTitle);
            if (currentWindowTitle.equals(windowTitle)) {
                break;
            }
        }
    }
}
