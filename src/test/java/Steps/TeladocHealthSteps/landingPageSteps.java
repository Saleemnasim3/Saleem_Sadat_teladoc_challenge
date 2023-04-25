package Steps.TeladocHealthSteps;

import Pages.Teladochealth.LandingPage;
import Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class landingPageSteps extends CommonMethods {

   // LandingPage landingPage = new LandingPage();

    @Given("user is on the front page")
    public void user_is_on_the_front_page() {
        setUp();

    }

    @Then("user should be able to see the following tabs")
    public void user_should_be_able_to_see_the_following_tabs(DataTable dataTable) {

        List<String> expectedTabs = dataTable.asList();
        System.out.println(expectedTabs);
        LandingPage landingPage = new LandingPage();

        List<String> actualTabs = new ArrayList<>();
        for (WebElement allTabs : landingPage.tabs) {
            actualTabs.add(allTabs.getText());
        }
        System.out.println(actualTabs);
        Assert.assertEquals(expectedTabs, actualTabs);


    }

    @When("user scrols down and scrols up")
    public void user_scrols_down_and_scrols_up() throws InterruptedException {

        System.out.println("This code is slwoing down the process");

//        Thread.sleep(6000);
//        scrolDown("window.scrollBy(0, 1000)");
//        scrolUp("window.scrollBy(0, -1000)");

    }

    @Then("user should see text {string} on the uper left of the page.")
    public void user_should_see_text_on_the_uper_left_of_the_page(String text) throws InterruptedException {
        LandingPage landingPage = new LandingPage();

        String actualText = landingPage.title.getText();
        Assert.assertEquals(text, actualText);

        System.out.println("Actual text is: "+actualText + " and expected text is: "+ text);

        Thread.sleep(6000);

    }

    @Then("user scrols down to and can click on the right and left arrow to view a team memebr.")
    public void user_scrols_down_to_and_can_click_on_the_right_and_left_arrow_to_view_a_team_memebr() throws InterruptedException {

        LandingPage landingPage = new LandingPage();
       scrolToElement("arguments[0].scrollIntoView();", landingPage.button);

       Thread.sleep(2000);
        click(landingPage.button);
    }


}
