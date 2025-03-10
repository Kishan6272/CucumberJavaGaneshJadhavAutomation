package SingaltonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BrowserTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       Browser instance1= Browser.getInstance();
       Browser instance2=null;


        Constructor<Browser>  declaredConstructor = Browser.class.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);
       instance2= declaredConstructor.newInstance();

        System.out.println("hash code of instance1"+ instance1.hashCode());
        System.out.println("hash code of instance2"+ instance2.hashCode());


    }
}
