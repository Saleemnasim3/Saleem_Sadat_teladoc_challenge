package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdministrativeManagementWorkbook extends CommonMethods {

    @FindBy (xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/workbooks/1609']")
    public WebElement administrativManagement;

    @FindBy (xpath = "//section[@data-tb-test-id='tb-card-view-active-section']")
    public List <WebElement> programOverview;





    public AdministrativeManagementWorkbook (){
        PageFactory.initElements(driver,this);
    }



}
