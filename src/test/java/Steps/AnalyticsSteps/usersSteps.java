package Steps.AnalyticsSteps;

import Pages.AdminManagementWorkbook.Userspage;
import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class usersSteps extends CommonMethods {

    Userspage userspage = new Userspage();

    @When("user navigates to Users view")
    public void user_navigates_to_users_view() {
        Userspage userspage = new Userspage();
        click(userspage.Users);
    }

    @Then("user can see text here {string}")
    public void user_can_see_text_here(String actualText) {

        // cant print the text
        //printTex(userspage.text);
        System.out.println("Can't print the text");
    }

    @Then("user can see the following elements in this workbook")
    public void user_can_see_the_following_elements_in_this_workbook(io.cucumber.datatable.DataTable dataTable) {

        List<String> expecteddropDowns = dataTable.asList();

        System.out.println(expecteddropDowns);

        List<String> actualDropdowns = new ArrayList<>();

        for (WebElement alldropdowns : userspage.dropdowns) {
            actualDropdowns.add(alldropdowns.getText());
        }
        System.out.println(actualDropdowns);

        driver.navigate().back();
    }
}






