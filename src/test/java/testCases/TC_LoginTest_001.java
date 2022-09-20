package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

    @Test(priority = 1)
    public void loginTest() throws InterruptedException{
        System.out.println("Login Form Opened");
        WebElement link_Home=webDriver.findElement(By.xpath("//div[@class='navbar-right hidden-xs']/a[text()='Login']"));
        Actions actions=new Actions(webDriver);
        actions.moveToElement(link_Home).click().build().perform();
        System.out.println("URL is opened");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmail(email);
        System.out.println("Entered Email");
        loginPage.setPassword(password);
        System.out.println("Entered password");
        loginPage.clickSubmit();
        System.out.println("Clicked Login");
        Thread.sleep(1000);
    }
    @Test(priority = 2)
    public void navigateMarketPlace() throws InterruptedException{
        System.out.println("Navigation to MarketPlace");
        WebElement navigateMarketPlace=webDriver.findElement(By.xpath("//div[@id='navbar-collapse-header']/ul/li[3]/a[text()='Marketplace']"));
        Actions actions=new Actions(webDriver);
        actions.moveToElement(navigateMarketPlace).click().build().perform();
        System.out.println("Search for Facebook for OpenCart");
        webDriver.findElement(By.xpath("//*[@name='filter_search']")).sendKeys("Facebook for OpenCart", Keys.ENTER);
        Thread.sleep(5000);
        String present=webDriver.findElement(By.xpath("//section/div[@class='extension-name']/p/a")).getText();
        if (present.equals("Facebook for OpenCart")) {
            System.out.println("Verified");
            Assert.assertTrue(true);
        } else {
            System.out.println("UnVerified");
            Assert.assertTrue(false);
        }
    }
}
