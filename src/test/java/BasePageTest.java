
import org.testng.annotations.Test;

public class BasePageTest extends SetUpWebDriver {

    @Test
    public void verifyCopyrightTextOnMainPage(){
        basePage.clickToMainPageButton();
        basePage.verifyShareButtonText();
    }

    @Test
    public void openShopPage(){
        basePage.clickToShopButton();
        shopPage.waitCatalogButton();
    }
    @Test
    public void openDiscountPage(){
        basePage.clickToDiscountButton();
        discountPage.verifyDiscountText();
    }
    @Test
    public void verifyCopyrightTextOnAllPages(){
        basePage.clickToMainPageButton();
        basePage.verifyCopyrightText();
        basePage.clickToShopButton();
        basePage.verifyCopyrightText();
        basePage.clickToDiscountButton();
        basePage.verifyCopyrightText();
        basePage.clickToAboutButton();
        basePage.verifyCopyrightText();
        basePage.clickToContactButton();
        basePage.verifyCopyrightText();

    }
}
