package PageObject;

import Utilis.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.HomeStepImpl;

public class homeStepDef extends CommonUtils {



    //CommonUtils.chromeDriverTL.set(driver);



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
        homeStep.close_the_browser();
    }

}
