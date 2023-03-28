package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/Features/AddDeleteEmployee.feature",
        glue = "Steps",
        dryRun = false,
        monochrome = true,
        strict = true,
        tags = ""


)

public class PureIWASessionRunner {
}



