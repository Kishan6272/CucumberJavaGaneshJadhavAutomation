package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver lDriver;



    public  LoginPage(WebDriver rDriver)
    {
        lDriver=rDriver;

        PageFactory.initElements(rDriver,this);
    }

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id= "Password")
    WebElement password;

    @FindBy(xpath= "//button[@class='button-1 login-button']")
    WebElement LoginButton;

    @FindBy(xpath= "//a[contains(text(),'Logout')]")
    WebElement LogoutButton;


    public void entreEmail(String emailAdd)
    {
        email.clear();
        email.sendKeys(emailAdd);
    }

    public void entrePassword(String pwd)
    {
        password.clear();
        password.sendKeys(pwd);
    }
    public void clickOnLoginButton()
    {
       LoginButton.click();
    }

    public void clickOnLogoutButton()
    {
        LogoutButton.click();
    }


}
