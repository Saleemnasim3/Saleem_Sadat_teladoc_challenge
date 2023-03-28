package Pages.AdminManagementWorkbook;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Userspage extends CommonMethods {


    @FindBy (xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/redirect_to_view/6563']")
    public WebElement Users;

    @FindBy (xpath = "//*[text()='Active Users by Specialty']")
    public WebElement text;


    @FindBy(xpath = "//span[@style='font-family: \"Montserrat Medium\", " +
            "Montserrat; font-size: 12px; line-height: 15px; color: rgb(51, 51, 51); font-weight: normal; font-style: normal; text-decoration: none;']")
    public List<WebElement> dropdowns;



    public Userspage (){
        PageFactory.initElements(driver,this);
    }

}
