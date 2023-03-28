package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ProgramManagementWorkbookPage extends CommonMethods {


    @FindBy(xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/workbooks/1611']")
    public WebElement programManagementWorkbook;

    @FindBy (xpath ="//section[@data-tb-test-id='tb-card-view-active-section']")
    public List<WebElement> programManagementViews;

    // To navigate back to the previous page.
    @FindBy (xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/projects/560']")
    public WebElement backButton;




    public ProgramManagementWorkbookPage(){
        PageFactory.initElements(driver, this); // we use the page factory initate elements in this page
    }

}
