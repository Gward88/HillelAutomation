import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitPage {
    WebDriver driver;
    WebDriverWait wait;

    InitPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
}
