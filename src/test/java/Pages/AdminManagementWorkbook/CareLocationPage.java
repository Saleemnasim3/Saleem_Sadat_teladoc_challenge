package Pages.AdminManagementWorkbook;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CareLocationPage extends CommonMethods {

    @FindBy (xpath = ("//*[@id=\"app-root\"]/div/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[2" +
            "]/div[1]/div/div[1]/section/div[5]/div/div/div/div[1]/div/div/a"))
    public WebElement CareLocation;

    @FindBy (xpath = ("//*[@id=\"title2447425776794081605_12305698397781351149\"]/div[1]/div/span/div"))

    public WebElement Text;

    @FindBy (xpath = ("//span[@style ='font-family: \"Montserrat Medium\", Montserrat; font-size: 12px; line-height: 15px; color: rgb(51, 51, 51); f" +
            "ont-weight: normal; font-style: normal; text-decoration: none;']"))
    public List<WebElement> CareLocationsDropdowns;

    public CareLocationPage (){
        PageFactory.initElements(driver, this);
    }
}
