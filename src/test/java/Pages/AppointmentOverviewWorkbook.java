package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AppointmentOverviewWorkbook extends CommonMethods {


    @FindBy (xpath="//a[@href='/#/site/InTouchEnd-to-EndTesting/workbooks/1610']")
    public WebElement appointmentOverview;

    @FindBy (xpath = ("//section[@data-tb-test-id='tb-card-view-active-section']"))
    public List<WebElement> apptOverviewViews;


    // To navigate back to the previous page.

    @FindBy (xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/projects/560']")
    public WebElement backButton;


    public AppointmentOverviewWorkbook (){

        PageFactory.initElements(driver, this);
    }
}
