import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class SetUpWebDriver {
    WebDriver driver;
    BasePage basePage;
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
         driver.get(baseUrl);
         basePage = new BasePage(driver);
    }


//    @AfterMethod()
//    public void teardown () {
//        driver.quit();
//    }
}
