package Pages.AmericanAirlines;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePicker extends CommonMethods {


    @FindBy(xpath = "//div[@id='aa-booking-module']//div[1]//div[1]//button[1]")
    public WebElement calendar;

    @FindBy(xpath = "//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div[@class='ui-datepicker-title']")
    public WebElement monthYear;

    @FindBy(xpath = "//a[@aria-label='Next Month']")
    public WebElement nextButton;

    @FindBy(xpath = "//body[1]/div[6]/div[1]/table[1]/tbody[1]//td\n")
    public WebElement day;


    @FindBy (xpath = "//div[@class='site-content-hero']//div[2]//div[1]//button[1]")
    public WebElement depCalendar;

    @FindBy (xpath = "//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div[@class='ui-datepicker-title']")
    public WebElement depMonthYear;

    @FindBy (xpath = "//a[@class='ui-datepicker-next ui-corner-all']")
    public WebElement depNextButton;

    @FindBy (xpath = "//body[1]/div[6]/div[1]/table[1]/tbody[1]//td")
    public WebElement depDay;







    public DatePicker() {
        PageFactory.initElements(driver, this);
    }


}
