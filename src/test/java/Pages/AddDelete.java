package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddDelete extends CommonMethods {

    @FindBy(xpath = "//button[@class='btn btn-link pull-right']")
    public WebElement addUserButton;

    @FindBy(name = "FirstName")
    public WebElement firstname;

    @FindBy(name = "LastName")
    public WebElement lastname;

    @FindBy(name = "UserName")
    public WebElement username;

    @FindBy(name = "Password")
    public WebElement password;

    @FindBy(name = "RoleId")
    public WebElement Role;

    @FindBy(name = "Email")
    public WebElement Email;

    @FindBy(name = "Mobilephone")
    public WebElement cellPhone;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement saveButton;

    @FindBy(xpath = "//table[@class='smart-table table table-striped']//tbody//td[1]")
    public List< WebElement> nameVerfication;

    @FindBy (xpath="//table[@class='smart-table table table-striped']//tbody//tr")
    public List<WebElement> rowValue;

    @FindBy(xpath = "//table[@class='smart-table table table-striped']//tbody//tr//td[2]")
    public List< WebElement> dletionVerification;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okButton;



    public AddDelete() {
        PageFactory.initElements(driver,this);
    }

}
