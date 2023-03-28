package Pages.AdminManagementWorkbook;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DevicesPage extends CommonMethods {

    @FindBy(xpath = "//span[@style='font-family: \"Montserrat Medium\", Montserrat; font-size: 12px; line-height: 15px; color: rgb(51, 51, 51);" +
            " font-weight: normal; font-style: normal; text-decoration: none;']")
    public List <WebElement> dropdown;

    @FindBy (xpath = "//*[text()='Device Family'][1]")
    public WebElement deviceFamily;

    @FindBy (xpath = "//*[text()='Active Devices by Device Family']")
    public WebElement ActiveDevicesbyDeviceFamily;

    @FindBy (xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/redirect_to_view/6562']")
    public WebElement DeviceView;

    public DevicesPage (){
        PageFactory.initElements(driver,this);
    }


}
