package lesson20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Homework {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "/html/body/app-root/div/div[1]/rz-category/div/main/ctg-catalog/div/div[2]/aside/ctg-filter-stack/div[2]/div/div/div/div/ctg-filter-section-checkbox/ul[1]")
    List<WebElement> checkBoxes;
    @FindBy(xpath = "/html/body/app-root/div/div[1]/rz-category/div/main/ctg-catalog/div/div[2]/aside/ctg-filter-stack/div[2]/div/div/div/div/ctg-filter-section-checkbox/ul[1]")
    WebElement checkBoxesElement;
    @FindBy(xpath = "//select[@class='select-css ng-pristine ng-valid ng-touched']")
    List<WebElement> dropDownMenu;
    @FindBy(xpath = "//select[@class='select-css ng-pristine ng-valid ng-touched']")
    WebElement dropDownMenuElement;



    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void checkBoxesAndDropDownMenu(){
        driver.get("https://rozetka.com.ua/notebooks/c80004/");
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxesElement));
        for(WebElement list : checkBoxes){
            if(list.getText().equals("HP")){
                list.click();
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(dropDownMenuElement));
        dropDownMenuElement.click();
        for (WebElement drop : dropDownMenu){
            if(drop.getText().equals(" Популярные ")){
                drop.click();
            }
        }
    }

    @AfterMethod()
    public void teardown () {
        driver.quit();
    }
}

