package Utilis;

import SingaltonPattern.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CommonUtils {

    //public static ThreadLocal<ChromeDriver> chromeDriverTL= new ThreadLocal<>();
   // ThreadLocal<ChromeDriver> cd=new ThreadLocal<>();
    private static volatile CommonUtils instance;

   public CommonUtils(){}
    public static ThreadLocal<WebDriver> chromeDriverTL = new ThreadLocal<>();

   public static void quitBrowser()
   {
       chromeDriverTL.get().quit();

   }




//    public static CommonUtils getInstance(String browser)
//    {
//        if(instance==null)
//        {
//            synchronized (WebDriverManager.class)
//            {
//                if(instance==null)
//                {
//                    instance=new CommonUtils();
//                }
//            }
//        }
//        if(chromeDriverTL.get()==null)
//        {
//            instance.initDriver(browser);
//        }
//
//        return instance;
//    }
//
//
//    private void initDriver(String browser) {
//
//       chromeDriverTL.set(new ChromeDriver());
//    }


}
