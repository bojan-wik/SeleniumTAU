package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;
import pages.WysiwygEditorPage;

public class FramesTests extends BaseTest {

    @Test
    public void wysiwygEditorTest() {
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditorLink();

        String text1 = "hello ";
        String text2 = "world";

        wysiwygEditorPage.
                clearTextArea().
                setTextArea(text1).
                clickIncreaseIndentButton().
                setTextArea(text2);

        Assert.assertEquals(wysiwygEditorPage.getTextFromEditor(), text1 + text2,
                "Text from the Editor incorrect");
    }

    @Test
    public void nestedFramesTest() {
        FramesPage framesPage = homePage.clickFramesLink();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();

        Assert.assertEquals(nestedFramesPage.getTextFromFrame("left"), "LEFT",
                "Text from left frame incorrect");
        Assert.assertEquals(nestedFramesPage.getTextFromFrame("bottom"), "BOTTOM",
                "Text from bottom frame incorrect");
    }
}
