package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public static String printTex(WebElement element) {

        String text = element.getText();

        return element.getText();



    }

    /*
    This method is used to make an assertion to verify the text in the printTex method
     */

    public static void verifyText(String actual, String expected) {
        Assert.assertEquals(actual, expected);
        System.out.println("Actual text is: " + actual + " and expected text is " + expected);

    }

    /*
    This method is to handle iFrame
     */

    public static void goToiFrame(int size) {
        driver.findElements(By.tagName("iFrame"));
        driver.switchTo().frame(size);

    }

         /*
    This method is to verify Datatable using List

    work on it to figure out how to create a data table
     */

        /*
        Scroll up and down on a page using javascript executor
         */


    public static void scrolDown(String jsexecutorDown) {
        // Initialize the JavaScript executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll up by pixels
        js.executeScript(jsexecutorDown);

        //sample code to scrol down 500 pixels: "window.scrollBy(0, 500)"

    }

    public static void scrolUp(String jsexecutorUp) {

        // Initialize the JavaScript executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll up by pixels
        js.executeScript(jsexecutorUp);

        //sample code to scrol up 500 pixels: "window.scrollBy(0, -500)"
    }

    /*
    Scrol to a specific eleemnt
     */

    public static void scrolToElement(String jsToElement, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll up by pixels
        js.executeScript(jsToElement, element);


        /*
        here is sample code how to scroll to a specific element on the page:
        "arguments[0].scrollIntoView();", element
        */
    }



    /*
    Handling Calendar method
    */


    /*
    Taking screenshot
     */

    public static byte[] takeScreenshot(String fileName) {

        TakesScreenshot ts = (TakesScreenshot) driver;

        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File(Constants.SCREENSHOT_FILEPATH + fileName + " " + getTimeStamp("MM-dd-yyy-HH-MM-ss") + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picBytes;
    }

    public static String getTimeStamp(String pattern) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static void tearDown() {

        if (driver != null) {
            driver.quit();
        }

    }


}



