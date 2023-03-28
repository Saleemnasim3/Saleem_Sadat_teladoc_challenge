package Steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PureIWASession extends CommonMethods {


    @FindBy(xpath = "//span[@class='css-1xvuvtv-Button-ButtonContent e9zb0fe3']")
    public WebElement continueInBrowser;


    @FindBy (id = "UsernameOrEmail")
    public WebElement Username;

    @FindBy (id="password")
    public WebElement Password;

    @FindBy (id="login")
    public WebElement Login;

    @Given("povider navigates to IWA CAT URL")
    public void povider_navigates_to_iwa_cat_url() {
        setUp();
        getWait();
       Alert alr= driver.switchTo().alert();
       String alrt=alr.getText();
        System.out.println(alrt);



    }

    @When("provider enters username and password and click on login")
    public void provider_enters_username_and_password_and_click_on_login() {
      PureIWASession obj = new PureIWASession();
        getWait();
        click(obj.continueInBrowser);  // Test Failing because I have to handle the JS warning before I can click on the element in the page. 
        sendText(obj.Username, ConfigReader.getPropertyValue("username"));
        sendText(obj.Password, ConfigReader.getPropertyValue("password"));
        click(obj.Login);


    }


    //Test is failing because we need to handle the JS alert and error is not such alert


//    @Then("Then provider successfully authticated")
//    public void then_provider_successfully_authticated() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


}
