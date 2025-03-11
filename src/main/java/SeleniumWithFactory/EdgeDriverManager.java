package SeleniumWithFactory;

import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeDriverManager implements BrowserDriver{
    @Override
    public WebDriver createDriver() {
        return new EdgeDriver();
    }
}
