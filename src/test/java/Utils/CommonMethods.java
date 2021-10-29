package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CommonMethods {


    public static WebDriver driver;

/*
This method is to set up browser
 */
    public static void setUp() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        if ("chrome".equals(ConfigReader.getPropertyValue("browser"))) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().window().maximize();
    }

    /*
    This method is to send text
     */

    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(textToSend);
    }

    /*
    This method is to click
     */
    public static void click(WebElement element) {

        element.click();
    }


    /*
    This method is to dynamically identify Novak
    */
    public static void Dynamictable(List<WebElement> element, String expectedtext)  {
        for (int i = 1; i <= element.size(); i++) {

            String Actualtext = element.get(i-1).getText();
            System.out.println("Actualtext: " + Actualtext);
            if (Actualtext.contains(expectedtext)) {

                driver.findElement(By.xpath("//table[@class='smart-table table table-striped']//tbody//tr[" + i + "]//td[last()]//button")).click();

                break;
            }
        }
    }


}
