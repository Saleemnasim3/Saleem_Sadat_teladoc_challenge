package Pages.AdminManagementWorkbook;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdministrativeManagementWorkbookPage extends CommonMethods {

    @FindBy (xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/workbooks/1609']")
    public WebElement administrativManagement;

    @FindBy (xpath = "//section[@data-tb-test-id='tb-card-view-active-section']")
    public List <WebElement> programOverview;

    /*
    To navigate back so that 'Appointment Overview Page is visible'
     */

    @FindBy (xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/projects/560']")
    public WebElement backButton;



    public AdministrativeManagementWorkbookPage (){
        PageFactory.initElements(driver,this);
    }



}
