package fileupload;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTest {

    @Test
    public void fileUploadTest() {
        FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
        String fileName = "file-sample-1.docx";
        fileUploadPage.uploadFile("C:\\Users\\bojanoww\\Downloads\\" + fileName).clickFileSubmitButton();
        Assert.assertEquals(fileUploadPage.getUploadedFilesResult(), fileName, "Uploaded file's name incorrect");
    }
}
