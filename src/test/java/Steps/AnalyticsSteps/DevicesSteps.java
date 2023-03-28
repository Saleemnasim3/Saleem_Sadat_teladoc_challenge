package Steps.AnalyticsSteps;

import Pages.AdminManagementWorkbook.DevicesPage;
import Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DevicesSteps extends CommonMethods {
    DevicesPage devicesPage = new DevicesPage();
    @When("user navigates to Program devices view")
    public void user_navigates_to_program_devices_view() throws InterruptedException {

       click(devicesPage.DeviceView);

       Thread.sleep(2000);
    }

    @Then("user can see text {string}")
    public void user_can_see_text(String actualText) {

        //printTex(devicesPage.ActiveDevicesbyDeviceFamily);
        System.out.println(actualText);


    }

    @Then("user can see the following elements")
    public void user_can_see_the_following_elements(DataTable dataTable) {
DevicesPage devicespage2 = new DevicesPage();


      List<String> expecteddropDowns = dataTable.asList();

        System.out.println(expecteddropDowns);

      List <String> actualDropdowns= new ArrayList<>();

        for (WebElement alldropdowns:devicespage2.dropdown) {
            actualDropdowns.add(alldropdowns.getText());
           }
        System.out.println(actualDropdowns);

    }

}
