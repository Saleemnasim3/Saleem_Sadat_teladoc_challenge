package Steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import uprPages.uprTriagePages;

public class stepsToTriage extends CommonMethods {



    @Given("user is logged in to UPR Practice as a Practice Admin")
    public void user_is_logged_in_to_upr_practice_as_a_practice_admin() throws InterruptedException {

       setUp();

        uprTriagePages obj = new uprTriagePages();

        click(obj.continueInBrowserButton);

        sendText(obj.Username, ConfigReader.getPropertyValue("username"));

        sendText(obj.Password, ConfigReader.getPropertyValue("password"));

        click(obj.Login);

       }


    @When("user clicks on dropdown on the uper right corner to select Practice Admin")
    public void user_clicks_on_dropdown_on_the_uper_right_corner_to_select_practice_admin() throws InterruptedException {
        uprTriagePages obj1 = new uprTriagePages();
        Thread.sleep(2000);
        click(obj1.Role);
        Thread.sleep(2000);
        click(obj1.PracticeAdmin);


    }

    @When("user licks on Dental Clinic Coordinator use Case {int} service from middle panel")
    public void user_licks_on_dental_clinic_coordinator_use_case_service_from_middle_panel(Integer int1) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        System.out.println("Implment this");
    }

    @When("user copies the service url from the right panel and open in browser")
    public void user_copies_the_service_url_from_the_right_panel_and_open_in_browser() {
        System.out.println("Implment this");
    }


    @When("user clicks continue in browser")
    public void user_clicks_continue_in_browser() {
        System.out.println("Implment this");
    }

    @Then("Teladoc Health Check In page will be displayed")
    public void teladoc_health_check_in_page_will_be_displayed() {
        System.out.println("Implment this");
    }
}
