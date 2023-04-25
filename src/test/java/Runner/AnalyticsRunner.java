package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/Features/AnalyticsLogin",

        glue = "Steps",
        dryRun = false,
        monochrome = true,
        strict = true,
        tags = "",
        plugin = {"pretty", "html:target/cucumber-reports/"} // this will create a report for us under target folder


)

public class AnalyticsRunner {


}
