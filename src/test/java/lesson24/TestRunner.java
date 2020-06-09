package lesson24;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestRunner extends SetUpDriver {

    @Test
    public void failTestCantFindFindButton(){
    driver.findElement(By.name("q")).sendKeys("Selenium");
    driver.findElement(By.className("gNO89b1")).click();
    }

    @Test
    public void searchingSomething(){
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.className("gNO89b")).click();
    }

    @Test
    public void failTestCantFindSearchField(){
        driver.findElement(By.name("q1")).sendKeys("Selenium");
        driver.findElement(By.className("gNO89b")).click();
    }
}
