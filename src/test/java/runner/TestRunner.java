package runner;




import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(tags="",
        features={"src\\test\\resources\\features"},
        glue = {"StepDefinitions"},
        plugin = {"pretty","html:target/htmlreport.report"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
