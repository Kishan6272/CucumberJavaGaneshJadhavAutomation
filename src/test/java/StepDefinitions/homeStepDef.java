package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomeStepImpl;

public class homeStepDef {

    static WebDriver driver;
    HomeStepImpl homeStep=new HomeStepImpl();

    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() {
        homeStep.user_navigates_to_the_login_page();

    }

    @When("User entre valid {string} and {string}")
    public void user_entre_valid_and(String string, String string2) {

      homeStep.user_entre_valid_and(string,string2);
    }

    @Then("Close the browser")
    public void close_the_browser() {
       driver.quit();
    }

}
