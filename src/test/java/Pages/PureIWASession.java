package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PureIWASession extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"wrap\"]/div/div[2]/div[3]/div[2]/button")
    public WebElement continueInBrowser1;


    @FindBy (id = "UsernameOrEmail")
    public WebElement Username;

    @FindBy (id="password")
    public WebElement Password;

    @FindBy (id="login")
    public WebElement Login;



    public PureIWASession() {
        PageFactory.initElements(driver,this);
    }

}



