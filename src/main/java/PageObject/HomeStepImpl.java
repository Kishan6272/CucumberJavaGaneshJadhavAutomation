package PageObject;

import Utilis.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import static pageObjects.homeStepDef.driver;

public class HomeStepImpl  extends CommonUtils {

    public static  WebDriver driver=new ChromeDriver();

    public void user_navigates_to_the_login_page() {
//driver = new ChromeDriver();
        //System.out.println("kishan");
        CommonUtils.chromeDriverTL.set( driver);
        CommonUtils.chromeDriverTL.get().get("https://www.saucedemo.com/v1/");
    }



    public void user_entre_valid_and(String string, String string2)
    {
        CommonUtils.chromeDriverTL.get().findElement(By.id("user-name")).sendKeys(string);
        CommonUtils.chromeDriverTL.get().findElement(By.id("password")).sendKeys(string2);
        CommonUtils.chromeDriverTL.get().findElement(By.id("login-button")).click();
    }


    public void close_the_browser()
    {
        CommonUtils.chromeDriverTL.get().quit();
    }
}
