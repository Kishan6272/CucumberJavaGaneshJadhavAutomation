package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeStepImpl {

    WebDriver driver;

    public void user_navigates_to_the_login_page() {
        driver = new ChromeDriver();
        //System.out.println("kishan");
        driver.get("https://www.saucedemo.com/v1/");
    }



    public void user_entre_valid_and(String string, String string2)
    {
        driver.findElement(By.id("user-name")).sendKeys(string);
        driver.findElement(By.id("password")).sendKeys(string2);
        driver.findElement(By.id("login-button")).click();
    }
}
