
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends InitPage {
    String baseUrl = "http://cup-cakebox.com/";
    @FindBy(id = "830844")
    WebElement mainPageButton;
    @FindBy(id = "1193760")
    WebElement shopButton;
    BasePage(WebDriver driver) {
        super(driver);
    }
    public void clickToMainPageButton(){
        driver.get(baseUrl);
        mainPageButton.click();
    }
}
