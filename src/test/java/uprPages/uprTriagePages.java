package uprPages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class uprTriagePages extends CommonMethods {

@FindBy(xpath = "//*[@id=\"wrap\"]/div/div[2]/div[3]/div[2]/button")
public WebElement continueInBrowserButton;

    @FindBy (id = "UsernameOrEmail")
    public WebElement Username;

    @FindBy (id="password")
    public WebElement Password;

    @FindBy (id="login")
    public WebElement Login;

    @FindBy (xpath="//div[@class='react-select__indicators css-1kn0218']")
    public WebElement Role;

    @FindBy (xpath="//*[@id=\"wrap\"]/div/div[2]/section/div[3]/section/section[3]/div[1]/div/div[1]/div[2]/div/div")
    public WebElement PracticeAdmin;




    @FindBy (xpath="//div[@class='css-yxkljj-style-LabelWrapper e10qug725']")
    public WebElement Services;


    public uprTriagePages(){
        PageFactory.initElements(driver,this);
    }

}
