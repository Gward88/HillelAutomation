import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DiscountPage extends BasePage{
    @FindBy(xpath = "//div[@class='text-2']")
    WebElement discountText;

    DiscountPage(WebDriver driver) {
        super(driver);
    }
    public void verifyDiscountText(){
        Assert.assertEquals(discountText.getText(), "Наши скидки действуют при заказе различных видов коробочек ;)");
    }
}
