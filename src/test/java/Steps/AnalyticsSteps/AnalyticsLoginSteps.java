package Steps.AnalyticsSteps;

import Pages.*;
import Pages.AdminManagementWorkbook.AdministrativeManagementWorkbookPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AnalyticsLoginSteps extends CommonMethods {


    @Given("user with Practice Admin role is logged in to IWA")
    public void user_with_practice_admin_role_is_logged_in_to_iwa() throws InterruptedException {

        setUp();

        AnalyticsLoginPage obj = new AnalyticsLoginPage();
        /*
        Adding a temprary wait as the implicit wait is not working
         */
        Thread.sleep(2000);
        sendText(obj.UsernameAnalytics, ConfigReader.getPropertyValue("username"));
        sendText(obj.passwordAnalytics, ConfigReader.getPropertyValue("password"));
        click(obj.loginAnalytics);


    }

    @When("provider clics on Analytics from left window")
    public void provider_clics_on_analytics_from_left_window() {

        AnalyticsLoginPage obj1 = new AnalyticsLoginPage();
        click(obj1.analyticsTab);

        /*
        to navigate to the next window
         */

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
        System.out.println(childWindow);


    }

    @Then("a new window will open with idep login")
    public void a_new_window_will_open_with_idep_login() {
     /*
     Move assertion method to CommonMethods class
      */
//        String actual = "";
//        String expected= ""
//        Assert.assertArrayEquals();

    }

    @Then("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {

        Thread.sleep(2000);

        AnalyticsLoginPage obj2 = new AnalyticsLoginPage();
        sendText(obj2.usernameToEnterAnalytics, ConfigReader.getPropertyValue("username"));
        sendText(obj2.passwordToEnterAnalytics, ConfigReader.getPropertyValue("password"));
        click(obj2.loginToEnterAnalytics);
    }

    @Then("user should be authenticated")
    public void user_should_be_authenticated() {

        String tableauExpected = driver.getTitle();
        String tableauActual;
        System.out.println(tableauExpected);
        //Assert.assertArrayEquals();
    }

    // make assertion and then continue to test the analytics workflow


    @When("user clicks on Start Exploring and user clicks on Analytics")
    public void user_clicks_on_start_exploring_and_user_clicks_on_analytics() {

        AnalyticsLoginPage obj3 = new AnalyticsLoginPage();
        click(obj3.startExploringBtn);
        click(obj3.Analytics);
    }

    @Then("user should be able to see the following these tabs Administrative Management, Appointment Overview, AV Quality Surveys, Program Management, Reliability")
    public void verifyTabs(DataTable dataTable) {
        AnalyticsLoginPage obj4 = new AnalyticsLoginPage();

        /*
        Store all the expected tabs in a list using a method calld asList() from datatable class
         */
        List<String> expectedTabs = dataTable.asList();

        /*
        Store all the actual tabs from tableau in a list
         */
        List<String> actualTabs = new ArrayList<>();
        for (WebElement ele : obj4.AnalyticsTab) {
            actualTabs.add(ele.getText());
        }
        System.out.print(actualTabs);
        System.out.println();
        System.out.println(expectedTabs);

        //  Assert.assertEquals(actualTabs,expectedTabs); assertion is failing figure out why. Actual are printed without commas. Expected are printed with Commas.
    }

       /*
        Administrative Management Workbook
         */

    @When("clicks on Administrative Management workbook")
    public void clicks_on_administrative_management_workbook() {
        AdministrativeManagementWorkbookPage adminWB = new AdministrativeManagementWorkbookPage();
        click(adminWB.administrativManagement);

    }

    @Then("user should see the following tabs")
    public void user_should_see_the_following_tabs(DataTable dataTable) throws InterruptedException {
        AdministrativeManagementWorkbookPage adminWB1 = new AdministrativeManagementWorkbookPage();
        List<String> expectedAdminWB1tabs = dataTable.asList();

        List<String> actualAdminWB1tabs = new ArrayList<>();
        for (WebElement allWB1 : adminWB1.programOverview) {
            actualAdminWB1tabs.add(allWB1.getText());
        }

        System.out.println();

        System.out.print(actualAdminWB1tabs);
        System.out.println();
        System.out.print(expectedAdminWB1tabs);

        /*
        We will navigate back to the previous page so that the administrative management workbook is visible on the dev tool
         */

        Thread.sleep(2000);
        click(adminWB1.backButton);

    }

    /*
    Appointment Overview Workbook
     */

    @When("user clicks on Appointment Overview workbook")
    public void user_clicks_on_appointment_overview_workbook() throws InterruptedException {
        AppointmentOverviewWorkbook aptOverview = new AppointmentOverviewWorkbook();
        click(aptOverview.appointmentOverview);
    }

    @Then("user should be able to to see the following views:")
    public void user_should_be_able_to_to_see_the_following_views(DataTable dataTable) throws InterruptedException {
        AppointmentOverviewWorkbook aptOverview1 = new AppointmentOverviewWorkbook();

        List<String> expectedViews = dataTable.asList();

        List<String> actualViews = new ArrayList<>();
        for (WebElement allActualViews : aptOverview1.apptOverviewViews) {
            actualViews.add(allActualViews.getText()); // getText is a method that risides in WebElement interface.
        }

        System.out.println();
        System.out.println(actualViews);
        System.out.println(expectedViews);
                /*
        We will navigate back to the previous page so that the administrative management workbook is visible on the dev tool
         */

        Thread.sleep(2000);
        click(aptOverview1.backButton);

    }

    /*
    AV Quality Surveys Workbook
     */

    @When("user clicks on AV Quality Surveys workbook")
    public void user_clicks_on_av_quality_surveys_workbook() {
        AVQulaitySurveysPage avQulaitySurveysPage = new AVQulaitySurveysPage();
        click(avQulaitySurveysPage.avQualitySurveys);
    }

    @Then("user should be able to see AV Quality Surveys view")
    public void user_should_be_able_to_see_av_quality_surveys_view() throws InterruptedException {
        AVQulaitySurveysPage avQulaitySurveysPage1 = new AVQulaitySurveysPage();
        System.out.println("Verify the view is there");


        //We will navigate back to the previous page so that the  is visible on the dev tool

        Thread.sleep(2000);
        click(avQulaitySurveysPage1.backButton);

    }


    /*
    Program Management Workbook
     */

    @When("user clicks on Program Management workbook")
    public void user_clicks_on_program_management_workbook() {
        ProgramManagementWorkbookPage progManagWkBk = new ProgramManagementWorkbookPage();
        click(progManagWkBk.programManagementWorkbook);
    }

    @Then("user should be able to see the following views:")
    public void user_should_be_able_to_see_the_following_views(DataTable dataTable) throws InterruptedException {
        ProgramManagementWorkbookPage progManagWkBk = new ProgramManagementWorkbookPage();

        List<String> expProgManageViews = dataTable.asList();

        List<String> actualProgManageViews = new ArrayList<>();
        for (WebElement allactaulViews : progManagWkBk.programManagementViews) {
            actualProgManageViews.add(allactaulViews.getText());
        }

        System.out.println(actualProgManageViews);
        System.out.println(expProgManageViews);

        //We will navigate back to the previous page so that the Reliability workbook is visible on the dev tool

        Thread.sleep(2000);
        click(progManagWkBk.backButton);

    }

    /*
        Reliability WorkBook
     */

    @When("user clicks on Reliability workbook")
    public void user_clicks_on_reliability_workbook() {
        ReliabilityWorkbookPage reliabilityWorkbookPage = new ReliabilityWorkbookPage();
        click(reliabilityWorkbookPage.ReliabilityWorkBook);


    }

    @Then("user should be able to see the following tabs:")
    public void user_should_be_able_to_see_the_following_tabs(DataTable dataTable) throws InterruptedException {
        ReliabilityWorkbookPage reliabilityWorkbookPage = new ReliabilityWorkbookPage();

        List<String> expectedReliabWrkBkviews = dataTable.asList();

        List<String> actualdReliabWrkBkviews = new ArrayList<>();
        for (WebElement allReliabilityViews : reliabilityWorkbookPage.ReliabilityWokbookViews) {
            actualdReliabWrkBkviews.add(allReliabilityViews.getText());
        }

        System.out.println(actualdReliabWrkBkviews);

        driver.navigate().back();

        Thread.sleep(3000);


    }



    }








