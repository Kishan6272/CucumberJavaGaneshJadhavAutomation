package SeleniumWithFactory;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

    public static WebDriver driver;

    @BeforeTest
    public void setUp( )
    {
       driver=DriverFactory.getDriver("firefox").createDriver();

    }

    @Test
    public void LofinTest()
    {   driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @AfterClass
    public void tearDown()
        {
          driver.quit();
        }
}
