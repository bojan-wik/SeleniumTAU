package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {

    private final WebDriver driver;
    private final WebDriver.Navigation navigate;

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
     * @param by "title" or "url"
     * @param titleOrUrl Expected window/tab title or URL (complete or URL path)
     */
    public void switchToWindow(String by, String titleOrUrl) {
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Number of opened windows/tabs: " + windowHandles.size());

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            switch (by) {
                case "title":
                    String currentWindowTitle = driver.getTitle();
                    if (currentWindowTitle.equals(titleOrUrl)) {
                        System.out.println("Switching to window with title: " + currentWindowTitle);
                        break;
                    }
                    break;
                case "url":
                    String currentWindowURL = driver.getCurrentUrl();
                    if (currentWindowURL.contains(titleOrUrl)) {
                        System.out.println("Switching to window with URL: " + currentWindowURL);
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("No such option in the switch statement");
            }
        }
    }
}
