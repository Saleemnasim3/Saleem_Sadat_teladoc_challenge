package Steps;

import Pages.AddDelete;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsToAddDeleteUsers extends CommonMethods {


    @Given("user is on the welcome page")
    public void user_is_on_the_welcome_page() {
        setUp();
    }

    @When("user clicks Continue in Browser Button")
    public void user_clicks_continue_in_browser_button() {
        AddDelete obj = new AddDelete();
        getWait();
        click(obj.continueInBrowser);

    }

    @When("user enters correct credentials in the Username and Password boxes")
    public void user_enters_correct_credentials_in_the_username_and_password_boxes() {
        AddDelete obj = new AddDelete();
        sendText(obj.Username, ConfigReader.getPropertyValue("username"));
        sendText(obj.Password, ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
        AddDelete obj = new AddDelete();
        click(obj.Login);
    }

    @Then("user should land on dashboard")
    public void user_should_land_on_dashboard() {
        System.out.println("Insert Assertion here");
    }


}



