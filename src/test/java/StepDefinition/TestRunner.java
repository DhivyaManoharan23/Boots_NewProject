package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty","json:target/JSONReports/report.json"},
        tags = "@divu"
)
public class TestRunner {
}
