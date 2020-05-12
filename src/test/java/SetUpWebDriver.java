import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class SetUpWebDriver {
    WebDriver driver;
    BasePage basePage;
    ShopPage shopPage;
    DiscountPage discountPage;
    AboutPage aboutPage;
    ContactsPage contactsPage;
    String browser = "chrome";
    String baseUrl = "http://cup-cakebox.com/";



    @BeforeMethod()
    public void setUp(){
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
         else if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
         else if (browser.equals("opera")){
             WebDriverManager.operadriver().setup();
             driver = new OperaDriver();
        }
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get(baseUrl);
         basePage = new BasePage(driver);
         shopPage = new ShopPage(driver);
         discountPage = new DiscountPage(driver);
         aboutPage = new AboutPage(driver);
         contactsPage = new ContactsPage(driver);
    }


    @AfterMethod()
    public void teardown () {
        driver.quit();
    }
}
