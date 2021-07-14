package webServiceTesting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports/cucumber-pretty"},
        monochrome = true,
        glue = "webServiceTesting.steps",
        features = "./src/test/resources/features/webServiceTesting",
        strict = true,
        tags = {"@Regression"}
)
public class WebServiceTestRunner {
}
