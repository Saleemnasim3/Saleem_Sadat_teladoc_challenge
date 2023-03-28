import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main (String []arg) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Saleem\\Desktop\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://saleem_testing.cat.visitnow.org");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        WebElement username=driver.findElement(By.id("UsernameOrEmail"));
        username.sendKeys("wstprovider");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Teladoc@123");
        WebElement loginbutton=driver.findElement(By.id("login"));
        loginbutton.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement analyticsTabs=driver.findElement(By.xpath("//a[@data-target='analytics-link']"));
        analyticsTabs.click();


        Set<String> windows=driver.getWindowHandles();
        Iterator<String> iterator =windows.iterator();
        String parentWindow =iterator.next();
        String childWindow=iterator.next();
        driver.switchTo().window(childWindow);
        driver.manage().window().fullscreen();
        System.out.println(childWindow);

        driver.findElement(By.id("UsernameOrEmail")).sendKeys("wstprovider");
        driver.findElement(By.id("password")).sendKeys("Teladoc@123");
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.id("login"));
        login.click();
        WebElement programOverview= driver.findElement(By.xpath("//a[@href='/#/site/InTouchEnd-to-EndTesting/redirect_to_view/6560']"));
        programOverview.click();
        int frameCount=driver.findElements(By.tagName("iFrame")).size();
        System.out.println(frameCount);
        driver.switchTo().frame(0);
        WebElement sessionDate = driver.findElement(By.xpath("//*[text()='Session Date']"));
       // System.out.println(sessionDate.getText());

        List <WebElement> dropedowns=driver.findElements(By.xpath("//span[@style='font-family: \"Montserrat Medium\", Montserrat; font-size: 12px; line-height: 15px; color: rgb(51, 51, 51); font-weight: normal; font-style: normal; text-decoration: none;']"));

        for (WebElement allvalues:dropedowns) {

            System.out.println(allvalues.getText());


        }









    }
}
