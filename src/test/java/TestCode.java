import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;


public class TestCode {


    public static void main(String[] args) throws InterruptedException, IOException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aa.com/homePage.do");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        WebElement calendar = driver.findElement(By.xpath("//div[@id='aa-booking-module']//div[1]//div[1]//button[1]"));
        calendar.click();

        String month = "August";
        String year = "2023";
        String desiredDay = "23"; //specify the desired day

        while (true) {
            String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div[@class='ui-datepicker-title']")).getText();
            String[] arr = monthyear.split(" ");
            String mon = arr[0];
            String yr = arr[1];

            if (mon.equalsIgnoreCase(month) && yr.equals(year))

                break;
             else
                driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/div[1]/a[1]")).click();

        }

        List<WebElement> allDates=driver.findElements(By.xpath("//body[1]/div[6]/div[1]/table[1]/tbody[1]//td"));

        for(WebElement ele:allDates){
         String days=ele.getText();

         if(days.equalsIgnoreCase(desiredDay)){
             ele.click();
              break;
         }


        }
    }


}



