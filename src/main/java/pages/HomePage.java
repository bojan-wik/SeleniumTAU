package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ContextMenuPage clickContextMenuLink() {
        clickLink("Context Menu");
        waitUntilUrlContains("context_menu");
        return new ContextMenuPage(getDriver());
    }

    public DropdownPage clickDropdownLink() {
        clickLink("Dropdown");
        waitUntilUrlContains("dropdown");
        return new DropdownPage(getDriver());
    }

    public DynamicLoadingPage clickDynamicLoadingLink() {
        clickLink("Dynamic Loading");
        waitUntilUrlContains("dynamic_loading");
        return new DynamicLoadingPage(getDriver());
    }

    public FileUploadPage clickFileUploadLink() {
        clickLink("File Upload");
        waitUntilUrlContains("upload");
        return new FileUploadPage(getDriver());
    }

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        waitUntilUrlContains("login");
        return new LoginPage(getDriver());
    }

    public FramesPage clickFramesLink() {
        clickLink("Frames");
        waitUntilUrlContains("frames");
        return new FramesPage(getDriver());
    }

    public HorizontalSliderPage clickHorizontalSliderLink() {
        clickLink("Horizontal Slider");
        waitUntilUrlContains("horizontal_slider");
        return new HorizontalSliderPage(getDriver());
    }

    public HoversPage clickHoversLink() {
        clickLink("Hovers");
        waitUntilUrlContains("hovers");
        return new HoversPage(getDriver());
    }

    public InfiniteScrollPage clickInfiniteScrollLink() {
        clickLink("Infinite Scroll");
        waitUntilUrlContains("infinite_scroll");
        return new InfiniteScrollPage(getDriver());
    }

    public JavaScriptAlertsPage clickJavaScriptAlertsLink() {
        clickLink("JavaScript Alerts");
        waitUntilUrlContains("javascript_alerts");
        return new JavaScriptAlertsPage(getDriver());
    }

    public MultipleWindowsPage clickMultipleWindowsLink() {
        clickLink("Multiple Windows");
        waitUntilUrlContains("windows");
        return new MultipleWindowsPage(getDriver());
    }

    public KeyPressesPage clickKeyPressesLink() {
        clickLink("Key Presses");
        waitUntilUrlContains("key_presses");
        return new KeyPressesPage(getDriver());
    }

    public LargeAndDeepDom clickLargeAndDeepDomLink() {
        clickLink("Large & Deep DOM");
        waitUntilUrlContains("large");
        return new LargeAndDeepDom(getDriver());
    }

    public ShiftingContentPage clickShiftingContentLink() {
        clickLink("Shifting Content");
        waitUntilUrlContains("shifting_content");
        return new ShiftingContentPage(getDriver());
    }

    public WysiwygEditorPage clickWysiwygEditorLink() {
        clickLink("WYSIWYG Editor");
        waitUntilUrlContains("tinymce");
        return new WysiwygEditorPage(getDriver());
    }
}
