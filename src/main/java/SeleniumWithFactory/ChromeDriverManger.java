package SeleniumWithFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManger implements BrowserDriver {
    @Override
    public WebDriver createDriver() {
        return new ChromeDriver();
    }
}
