package lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWorkLesson21{
    WebDriver driver;

    @FindBy(xpath = "//input[@name='q']")
    WebElement searchField;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
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
}
