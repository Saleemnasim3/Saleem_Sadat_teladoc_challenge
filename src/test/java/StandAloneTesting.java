import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StandAloneTesting {


public static void main(String[]arg) throws InterruptedException {


    System.setProperty("webdriver.chrome.driver", "C:\\Saleem\\Desktop\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.navigate().to("https://saleem_testing.cat.visitnow.org");
    driver.manage().window().maximize(); // fullscreen was not working so I used maximize. Maybe a bugin fullscreen method.
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //Thread.sleep(8000);
    WebElement usernameOrEmail = driver.findElement(By.id("UsernameOrEmail"));
    usernameOrEmail.sendKeys("mytest");
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("Teladoc@123");
    WebElement login = driver.findElement(By.id("login"));
    login.click();
    //Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id=\"wrap\"]/div/div[2]/section/section/div/div[2]/a[2]/div")).click();
    //Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[2]/div/div/button/span")).click();
    //Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/input")).sendKeys("Pat");
    driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/span[1]")).click();
    //Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div[3]/div[2]/div/div/button")).click();
    WebElement patientUrl=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/button/span/span[1]"));
    patientUrl.click();
    driver.findElement(By.xpath("//*[@id=\"wrap\"]/div/div[2]/div/div/section/div[4]/div[3]/div[1]/button")).click();

    // Try to have a win PAS session (connect to the session from IWA through WinPAS) and see if it works.






}



}
