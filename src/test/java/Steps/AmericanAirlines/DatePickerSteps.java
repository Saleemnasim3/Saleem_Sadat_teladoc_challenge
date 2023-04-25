package Steps.AmericanAirlines;

import Pages.AmericanAirlines.DatePicker;
import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatePickerSteps extends CommonMethods {

//    public DatePicker datePicker;
//
//    public DatePickerSteps() {
//        datePicker = new DatePicker();
//    }

    @Given("user is on American Airline booking page")
    public void user_is_on_american_airline_booking_page() {

        setUp();

    }

    @When("user clicks on Calendar on the depart section")
    public void user_clicks_on_calendar_on_the_depart_section() {

        DatePicker datePicker = new DatePicker();
        click(datePicker.calendar);

    }


    // create a method that takes month year and day as parameters and

    @Then("user should be able to select any month and day and year")
    public void user_should_be_able_to_select_any_month_and_day_and_year() {

        DatePicker datePicker1 = new DatePicker();
        String month = "August";
        String year = "2023";
        String desiredDay = "23"; //specify the desired day

        while (true) {

            String[] arr = printTex(datePicker1.monthYear).split(" ");

            String mon = arr[0];
            String yr = arr[1];

            if (mon.equalsIgnoreCase(month) && yr.equals(year))

                break;
            else
                click(datePicker1.nextButton);


        }


    }

    @Then("user should be able to click on departture calendar")
    public void user_should_be_able_to_click_on_departture_calendar() {
        DatePicker datePickerDep = new DatePicker();

        click(datePickerDep.depCalendar);
    }

    @Then("user should be able to navigate to any year and month")
    public void user_should_be_able_to_navigate_to_any_year_and_month() throws InterruptedException {

        DatePicker datePickerDep1 = new DatePicker();

        String desireY = "2023";
        String desireM = "December";
        String desrireD = "18";

        while (true) {
            String[] arr = printTex(datePickerDep1.depMonthYear).split(" ");

            String actualmon = arr[0];
            String actualyr = arr[1];

            System.out.println(arr[0] + arr[1]);


            if (actualmon.equalsIgnoreCase(desireM) && actualyr.equals(desireY))

                //  System.out.println();
                break;

            else

                Thread.sleep(2000);

            click(datePickerDep1.depNextButton);

        }


    }


}





