package browserTesting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports/cucumber-pretty"},
        monochrome = true,
        glue = "browserTesting.steps",
        features = "./src/test/resources/features/browserTesting",
        strict = true,
        tags = {"@Regression"}
)
public class BrowserTestRunner {}

//plugin = {"pretty", "html:./src/test/resources/features/browserTesting/testReport"},