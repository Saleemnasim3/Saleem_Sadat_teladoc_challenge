package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDelete extends CommonMethods {

    @FindBy(xpath = "//span[@class='css-1xvuvtv-Button-ButtonContent e9zb0fe3']")
    public WebElement continueInBrowser;

    @FindBy (id = "UsernameOrEmail")
    public WebElement Username;

    @FindBy (id="password")
    public WebElement Password;

    @FindBy (id="login")
    public WebElement Login;



    public AddDelete() {
        PageFactory.initElements(driver,this);
    }

}
