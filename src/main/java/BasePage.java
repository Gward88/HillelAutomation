

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class BasePage extends InitPage {
    String textForCopyright = "© 2018 «Cupcake Box». Красивая упаковка из пищевого картона\n" +
            "Администрирование интернет-магазина Scratch Studio";

    @FindBy(id = "830844")
    WebElement mainPageButton;
    @FindBy(id = "1193760")
    WebElement shopButton;
    @FindBy(id = "1322535")
    WebElement discountButton;
    @FindBy(id = "829080")
    WebElement aboutButton;
    @FindBy(id = "829077")
    WebElement contactsButton;
    @FindBy(className = "photographer-copyright")
    WebElement copyrightText;
    @FindBy(xpath = "//span[@class='_49vh _2pi7']")
    WebElement shareButton;

    BasePage(WebDriver driver) {
        super(driver);
    }

    public void clickToMainPageButton(){
        mainPageButton.click();
        wait.until(elementToBeClickable(copyrightText));
    }

    public void verifyCopyrightText(){
        Assert.assertEquals(copyrightText.getText(), textForCopyright);
    }

    public void verifyShareButtonText(){
        Assert.assertEquals(shareButton.getText(), "Поделиться");
    }

    public void clickToShopButton(){
        shopButton.click();
    }
    public void test123(){

    }
    public void clickToDiscountButton(){
        discountButton.click();
    }

    public void clickToAboutButton(){
        aboutButton.click();
    }

    public void clickToContactButton(){
        contactsButton.click();
    }
}
