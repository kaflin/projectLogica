package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver webDriver;

    public LoginPage(WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }
    @FindBy(name = "email")
    @CacheLookup
    WebElement email;

    @FindBy(name = "password")
    @CacheLookup
    WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    @CacheLookup
    WebElement login;

    public void setEmail(String emailP) {
        email.sendKeys(emailP);
    }
    public void setPassword(String passwordP) {
        password.sendKeys(passwordP);
    }
    public void clickSubmit(){
        login.click();
    }
}
