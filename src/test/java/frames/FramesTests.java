package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
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
}
