package Steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

    @Before

    public void start() {
        //setUp();

    }


    @After
    public void end(Scenario scenario) {
        // we taking screensht here before we tear down the browswer

        byte[] pic; // all screenshots will be saved in array of bytes
        if (scenario.isFailed()) {
            pic = takeScreenshot("failed/" + scenario.getName());

            scenario.attach(pic, "image/png", scenario.getName());
            tearDown();


        }
    }
}
