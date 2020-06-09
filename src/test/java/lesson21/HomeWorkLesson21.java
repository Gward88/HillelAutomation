package lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWorkLesson21{
    WebDriver driver;
    Actions action;

    @FindBy(xpath = "//input[@name='q']")
    WebElement searchField;
    @FindBy(xpath = "//img[@style='cursor: pointer;']")
    WebElement imageForRightClick;
    @FindBy(id = "dm2m1i1tdT")
    WebElement productInfo;
    @FindBy(id = "dm2m2i4tdT")
    WebElement supportedBrowsers;
    @FindBy(id = "dm2m4i1tdT")
    WebElement macOS;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }

    @Test
    public void keyControl(){
        driver.get("https://www.google.com/");
        searchField.sendKeys("123");
        searchField.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        searchField.sendKeys(Keys.chord(Keys.COMMAND, "c"));
        searchField.click();
        searchField.sendKeys(Keys.chord(Keys.COMMAND, "v"));
    }
    @Test
    public void keyControl1(){
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
        search.click();
        search.sendKeys("123");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        actions.sendKeys(Keys.chord(Keys.COMMAND, "c"));
        searchField.click();
        actions.sendKeys(Keys.chord(Keys.COMMAND, "v"));
    }

    @Test
    public void popupMenu(){
        driver.get("http://deluxe-menu.com//popup-mode-sample.html");
        action.contextClick(imageForRightClick).perform();
        action.moveToElement(productInfo).perform();
        action.moveToElement(supportedBrowsers).perform();
        action.moveToElement(macOS).perform();


    }
}
