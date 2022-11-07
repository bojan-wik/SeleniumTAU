package wysiwygeditor;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class WysiwygEditorTests extends BaseTest {

    @Test
    public void test1() {
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditorLink();
        wysiwygEditorPage.clearEditorAndSetText(".");
    }
}
