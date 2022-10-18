package dropdown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownTests extends BaseTest {

    @Test
    void selectOptionTest() {
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        String option = "Option 2";
        dropdownPage.selectOption(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
