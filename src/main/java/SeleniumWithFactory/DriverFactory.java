package SeleniumWithFactory;

import java.util.Locale;

public class DriverFactory {

    public static BrowserDriver getDriver(String browsertype)
    {
        switch (browsertype.toLowerCase())
        {
            case "chrome":
                return new  ChromeDriverManger();

            case "firefox":
                return new  FireFoxDriverManager();
            case "edge":
                return new  EdgeDriverManager();

                default:
                throw  new IllegalArgumentException("not valid browser"+ browsertype);

        }
    }
}
