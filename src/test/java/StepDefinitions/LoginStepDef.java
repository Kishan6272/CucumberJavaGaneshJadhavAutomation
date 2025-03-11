package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LoginPage;

public class LoginStepDef {

   public WebDriver driver;

   public LoginPage loginPage;



    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {

     driver=new ChromeDriver();
     loginPage=new LoginPage(driver);

    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
     driver.get(url);

    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {

     loginPage.entreEmail(email);
     loginPage.entrePassword(password);

    }

    @When("Click on Login")
    public void click_on_login() {
     loginPage.clickOnLoginButton();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String expectedTitle) {
       String actualTitle=driver.getTitle();
     Assert.assertEquals(expectedTitle,actualTitle);


    }

    @When("User click on Log out link")
    public void user_click_on_log_out_link() {

     loginPage.clickOnLogoutButton();

    }

    @Then("close browser")
    public void close_browser() {
     driver.close();
     driver.quit();

    }

}
