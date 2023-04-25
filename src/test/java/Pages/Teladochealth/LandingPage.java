package Pages.Teladochealth;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage extends CommonMethods {

    @FindBy (xpath="//button[@class='siteHeaderNavItem-module--link--6b414 ']")
    public List <WebElement> tabs;

    @FindBy (xpath="//h1[@class='heroHome-module--title--9f1d8']")
    public WebElement title;

    @FindBy (xpath="//button[@class='slider-module--forward--291d3']")
    public WebElement button;






    public LandingPage (){
        PageFactory.initElements(driver,this);
    }

}
