package SingaltonPattern;

public class BrowserClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Browser instance= Browser.getInstance();

       Browser instance1=(Browser) instance.clone();

    }
}
