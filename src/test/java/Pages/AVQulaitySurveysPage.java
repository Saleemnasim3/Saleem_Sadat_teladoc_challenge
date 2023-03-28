package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AVQulaitySurveysPage extends CommonMethods {

    @FindBy (xpath = "//a[@href= '/#/site/InTouchEnd-to-EndTesting/workbooks/1687']")
    public WebElement avQualitySurveys;

    @FindBy (xpath = "//a[href = '/#/site/InTouchEnd-to-EndTesting/redirect_to_view/6841']")
    public WebElement avQualitySurveysView;


    // To navigate back to the previous page.
    @FindBy (xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/projects/560']")
    public WebElement backButton;


    public AVQulaitySurveysPage (){
        PageFactory.initElements(driver,this);
    }

}
