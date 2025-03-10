package SingaltonPattern;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest {
    public WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setUp(String browser)
    {
       driver= WebDriverManager.getInstance(browser).getDriver();
    }

    @Test
    public void firstTest()
    {
        driver.get("https://www.google.com/");
        System.out.println(Thread.currentThread().getName()+"  "+driver.getTitle());
    }


    @AfterClass
    public void tearDown()
    {
        WebDriverManager.quitBrowser();
    }
}
