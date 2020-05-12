import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class ShopPage extends InitPage {
    @FindBy(xpath = "//*[contains(text(),'КАТАЛОГ КОРОБОК')]")
    WebElement catalogBoxes;

    ShopPage(WebDriver driver) {
        super(driver);
    }
    public void waitCatalogButton(){
        wait.until(elementToBeClickable(catalogBoxes));
    }

}
