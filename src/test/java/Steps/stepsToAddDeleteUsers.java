package Steps;

import Pages.AddDelete;
import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class stepsToAddDeleteUsers extends CommonMethods {

    String firstname = "FirstTest";


    @Given("Engr Candidate is on main page")
    public void engr_candidate_is_on_main_page() {
        setUp();

    }


    @When("Engr Candidate clicks on Add User button")
    public void engr_candidate_clicks_on_add_user_button() {
        AddDelete obj = new AddDelete();
        click(obj.addUserButton);
    }



    @When("Engr Candidate enters firstname, lastname, username, password, select customer, role, enters email, cell phone")
    public void engr_candidate_enters_firstname_lastname_username_password_select_customer_role_enters_email_cell_phone() {
        AddDelete obj = new AddDelete();
        sendText(obj.firstname, firstname);
        sendText(obj.lastname, "LastTest");
        sendText(obj.username, "FLTest");
        sendText(obj.password, "123456");



        click(obj.Role);
        Select role = new Select(obj.Role);
        List<WebElement> list = role.getOptions();
        for (WebElement vlaues : list) {
            String text = vlaues.getText();
            if (text.equalsIgnoreCase("Customer")) {

                role.selectByVisibleText("Customer");
            }
        }

        sendText(obj.Email, "test@yahoo.com");
        sendText(obj.cellPhone, "123456789");


    }

    @When("Engr Candidate clicks on save button option")
    public void engr_candidate_clicks_on_save_button_option() {
        AddDelete obj = new AddDelete();
        click(obj.saveButton);
    }


    @Then("verify user is added")
    public void user_should_be_added_to_the_main_page() {
        AddDelete obj = new AddDelete();
        for (WebElement element : obj.nameVerfication) {
            String firstnameText = element.getText();
            if (firstnameText.contains(firstname)) {
                System.out.println("user successfully added");
                break;
            }
        }
    }

    @When("Engr Candidate clicks on the remove X button")
    public void engr_candidate_clicks_on_the_remove_x_button() throws InterruptedException {
        AddDelete obj = new AddDelete();
        Dynamictable(obj.rowValue, "Mark");
    }

    @When("Engr Candidate clicks on okay button")
    public void engr_candidate_clicks_on_okay_button() {
        AddDelete obj=new AddDelete();
        click(obj.okButton);
    }


    @Then("verify the user is deleted")
    public void verify_the_user_is_deleted() {
        AddDelete obj = new AddDelete();

        boolean flag = true;
        for (WebElement LastNames: obj.dletionVerification) {
            String allLastNames=LastNames.getText();
            System.out.println(allLastNames);
            if(allLastNames.contains("Novak")){
                flag=false;
                break;
            }
        }

        Assert.assertTrue(flag);





    }
}


