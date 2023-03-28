package Pages.AdminManagementWorkbook;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DailyActivityPage extends CommonMethods {


    @FindBy(xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/redirect_to_view/6561']")
    public WebElement DailyActivity;

    @FindBy (xpath = "//*[text()='Program Type'][1]" )
    public WebElement ProgramTypeKey;

    @FindBy (xpath = "//span[@style='font-family: \"Montserrat Medium\", Montserrat; font-size: 12px; line-height:" +
            " 15px; color: rgb(51, 51, 51); font-weight: normal; font-style: normal; text-decoration: none;']")
    public List <WebElement> dropDowns;



    public DailyActivityPage(){
        PageFactory.initElements(driver, this);
    }
}
