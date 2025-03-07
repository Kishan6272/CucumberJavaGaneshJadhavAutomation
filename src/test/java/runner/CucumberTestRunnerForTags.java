package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(//tags="@Smoke and @Regression and not @perf",
        features={"src\\test\\resources\\features"},
        glue = {"StepDefinitions"},
        plugin = {"pretty","html:target/htmlreport.report"}
)
public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests {
}
