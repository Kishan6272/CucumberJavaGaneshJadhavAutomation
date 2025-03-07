package Utilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CommonUtils {

    //public static ThreadLocal<ChromeDriver> chromeDriverTL= new ThreadLocal<>();
   // ThreadLocal<ChromeDriver> cd=new ThreadLocal<>();

    public static ThreadLocal<WebDriver> chromeDriverTL = new ThreadLocal<>();

}
