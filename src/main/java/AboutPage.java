import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AboutPage extends BasePage{
    @FindBy(xpath = "//span[@style='color:#d1a77d;']")
    WebElement takeALookButton;

    AboutPage(WebDriver driver) {
        super(driver);
    }

    public void verifyTextOnCatalogButton(){
        Assert.assertEquals(takeALookButton.getText(), "Взгляните на наш");
    }
}
