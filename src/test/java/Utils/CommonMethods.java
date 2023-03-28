package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonMethods {


    public static WebDriver driver;

    /*
    This method is to set up browser
     */
    public static void setUp() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        if ("chrome".equals(ConfigReader.getPropertyValue("browser"))) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(true);
            driver = new ChromeDriver();
        }

        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);


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
    This method is to Synchronize
       */

    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
        return wait;
    }

    /*
    This method is to switch to Alert and accept it.
     */

    public static void alert() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    /*/

   This method is to make assertion
     */

    /*
    This method is to get text of an element.
     */

    public static void printTex(WebElement element) {

        String text=element.getText();

        System.out.println(text);

        }

    /*
    This method is to handle iFrame
     */

    public static void goToiFrame(int size) {
        driver.findElements(By.tagName("iFrame"));
        driver.switchTo().frame(size);



         /*
    This method is to verify Datatable using List

    work on it to figure out how to create a data table
     */


        }


    }

