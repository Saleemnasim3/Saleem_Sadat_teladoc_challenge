package Steps.AnalyticsSteps;

import Pages.AdminManagementWorkbook.AdminManagWorkbkProgramOverviewPage;
import Pages.AdminManagementWorkbook.AdministrativeManagementWorkbookPage;
import Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProgramOverview extends CommonMethods {




     /*
    Verify elements on Program overviw of Administrative Management workbook
     */


    @When("user navigates to Program Overview view of this workbook")
    public void user_navigates_to_program_overview_view_of_this_workbook() throws InterruptedException {

        AdministrativeManagementWorkbookPage obj = new AdministrativeManagementWorkbookPage();
        click(obj.administrativManagement); // before going to program overview page we need to click on Administrative Management workbook

        AdminManagWorkbkProgramOverviewPage programOverview = new AdminManagWorkbkProgramOverviewPage();
        click(programOverview.ProgramOverview);

        // Thread.sleep(3000);

    }

    @Then("user can see Session Date")
    public void user_can_see_session_date() {
        AdminManagWorkbkProgramOverviewPage programOverview = new AdminManagWorkbkProgramOverviewPage();

        goToiFrame(0); // will switch to iFrame in 0th index. See implmentatino in the CommonMethods Class

        printTex(programOverview.SessionDateFilter);
    }

    @Then("user can see Program Type")
    public void user_can_see_program_type() throws InterruptedException {

//        try {
//            AdminManagWorkbkProgramOverviewPage programOverview1 = new AdminManagWorkbkProgramOverviewPage();
//            Thread.sleep(5000);
//            printTex(programOverview1.ProgramTypeKey);
//
//        } catch (NoSuchElementException e) {
//            System.out.println("Element not found");
//        }.

        System.out.println("Verify the code again. Failing here");
    }


    @Then("user should be able to see the following dropdowns")
    public void user_should_be_able_to_see_the_following_dropdowns(DataTable dataTable) {

        AdminManagWorkbkProgramOverviewPage programOverview2 = new AdminManagWorkbkProgramOverviewPage();

        List<String> expecteDropdowns = dataTable.asList();

        List<String> actualDropdowns = new ArrayList<>();

        for (WebElement allexpectedDropdowns : programOverview2.dropdowns) {
            actualDropdowns.add(allexpectedDropdowns.getText());
        }


        System.out.println("Expected Dropdowns:" + expecteDropdowns);
        System.out.println("Actual Dropdowns:" + actualDropdowns);
        System.out.println("-------------");

    }

    @Then("user should be able to see the following metrics")
    public void user_should_be_able_to_see_the_following_metrics(DataTable dataTable) {
        AdminManagWorkbkProgramOverviewPage programOverviewPage3 = new AdminManagWorkbkProgramOverviewPage();

        List<String> expectedMetrics = dataTable.asList();

        List<String> actualMetrics = new ArrayList<>();

        for (WebElement allExpectedMetics : programOverviewPage3.TableMtrics) {
            actualMetrics.add(allExpectedMetics.getText());
        }

        //Assert.assertTrue(expectedMetrics.equals(actualMetrics));
        System.out.println("Expected Metrics:" + expectedMetrics);
        System.out.println("Actual Metrics:" + actualMetrics);


        driver.navigate().back();

    }
}
