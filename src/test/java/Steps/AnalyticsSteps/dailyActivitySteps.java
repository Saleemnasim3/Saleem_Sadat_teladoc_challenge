package Steps.AnalyticsSteps;

import Pages.AdminManagementWorkbook.DailyActivityPage;
import Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class dailyActivitySteps extends CommonMethods {

    /*
Daily Activity View of Administrative Workbook
 */

    @When("Navigate to Daily Activity view of this workbook")
    public void navigate_to_daily_activity_view_of_this_workbook() {
        DailyActivityPage dailyActivity = new DailyActivityPage();
        click(dailyActivity.DailyActivity);



    }

    @When("verify if all expected elements are present and contain some data")
    public void verify_if_all_expected_elements_are_present_and_contain_some_data(DataTable dataTable) {
        DailyActivityPage dailyActivity = new DailyActivityPage();

        List <String> actualMetrics = dataTable.asList();

        List <String> expectedMetrics = new ArrayList<>();
        for (WebElement allExpectedMetrics:dailyActivity.dropDowns) {
            actualMetrics.add(allExpectedMetrics.getText());
        }

        System.out.println(expectedMetrics);
        System.out.println(actualMetrics);

        driver.navigate().back();
    }



}
