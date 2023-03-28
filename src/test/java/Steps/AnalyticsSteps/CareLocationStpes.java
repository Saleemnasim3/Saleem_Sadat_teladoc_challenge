package Steps.AnalyticsSteps;

import Pages.AdminManagementWorkbook.CareLocationPage;
import Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CareLocationStpes extends CommonMethods {


    CareLocationPage careLocationPage = new CareLocationPage();

    @When("user navigates to CareLocation view")
    public void user_navigates_to_care_location_view() {

        click(careLocationPage.CareLocation);
    }

    @Then("user can see text that reads {string}")
    public void user_can_see_text_that_reads(String string) {

        //  printTex(careLocationPage.Text);
        System.out.println("Cant find the xpath. Figure out why");

    }

    @Then("user should see the following elements in this workbook")
    public void user_should_see_the_following_elements_in_this_workbook(DataTable dataTable) {


        List<String> actualCareLocationDropDowns = dataTable.asList();
        System.out.println(actualCareLocationDropDowns);

        List<String> expectedCareLocationDD = new ArrayList<>();
        for (WebElement alldd : careLocationPage.CareLocationsDropdowns) {
            expectedCareLocationDD.add(alldd.getText());

        }

        System.out.println(expectedCareLocationDD);


    }
}
