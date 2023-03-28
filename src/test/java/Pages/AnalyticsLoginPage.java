package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AnalyticsLoginPage extends CommonMethods {

    @FindBy(id = "UsernameOrEmail")
    public WebElement UsernameAnalytics;

    @FindBy (id="password")
    public WebElement passwordAnalytics;

    @FindBy (id="login")
    public WebElement loginAnalytics;

    @FindBy (xpath = "//div[@class='react-select__indicators css-1kn0218']")
    public WebElement practiceAdminRole;

    @FindBy (className = "Practice Admin")
    public WebElement getPracticeAdmin;

    @FindBy (xpath = "//a[@data-target='analytics-link']")
    public WebElement analyticsTab;

    @FindBy (id = "UsernameOrEmail")
    public WebElement usernameToEnterAnalytics;

    @FindBy (id="password")
    public WebElement  passwordToEnterAnalytics;

    @FindBy (id="login")
    public WebElement loginToEnterAnalytics;

    @FindBy (xpath = "//button[text()='Start Exploring']")
    public WebElement startExploringBtn;

    @FindBy (xpath = "//a[@href='/#/site/InTouchEnd-to-EndTesting/projects/560']")
    public WebElement Analytics;

    @FindBy (xpath = "//section[@data-tb-test-id='tb-card-view-active-section']")
    public List <WebElement> AnalyticsTab;






    public AnalyticsLoginPage (){
        PageFactory.initElements(driver, this);
    }





}
