package javascript;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.LargeAndDeepDom;

import java.util.ArrayList;
import java.util.List;

public class JavaScriptTests extends BaseTest {

    @Test (priority = 1)
    public void scrollToTableTest() {
        LargeAndDeepDom largeAndDeepDom = homePage.clickLargeAndDeepDomLink();
        largeAndDeepDom.scrollToTable();
    }

    @Test (priority = 2)
    public void infiniteScrollTest() {
        homePage.clickInfiniteScrollLink().scrollToNthParagraph(5);
    }

    @Test (priority = 3)
    public void addMultipleAttributeToDropdownTest() {
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.addMultipleAttribute();

        List<String> optionsToSelect = new ArrayList<>(List.of("Option 1", "Option 2"));
        for (String option : optionsToSelect) {
            dropdownPage.selectOption(option);
        }

        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 2, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.containsAll(optionsToSelect), "Incorrect options selected");
    }
}
