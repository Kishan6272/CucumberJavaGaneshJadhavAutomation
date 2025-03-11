package SingaltonPattern;

import java.io.Serializable;

public class Browser implements Serializable,Cloneable {


    //private static instance of a class


    private volatile static Browser browser;


    //private constructor so that no one can instantiate the class

    private Browser() {
        if(browser!=null)
        {  //handlilng the reflection attack
            throw  new IllegalArgumentException("Object already exists");
        }
    }

    public   static Browser getInstance(){

        if(browser==null)
        {
            synchronized (Browser.class) {
                if(browser==null) {
                    browser = new Browser();
                }
            }
        }
        return browser;
    }


    public void displayMsg()
    {
        System.out.println("browser info");
    }

   protected Object readResolve()
    {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
      throw new CloneNotSupportedException("singalton instance can not be cloned");
    }
}
