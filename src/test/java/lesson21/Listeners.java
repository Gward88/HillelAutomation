package lesson21;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Listeners {
    @Test
    public void listener(ITestResult iTestResult) {
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        //добавление линки на скриншот, target="_blank\ - опция открытия в новой табе браузера
        Reporter.log("<a href=\"D:\\Hillel\\screenshot\\error.jpg\" target=\"_blank\">Screenshot link</a>");
        //ниже добавление тамбнейла для этого скриншота
        Reporter.log("<br>");
        Reporter.log("<a href=\"D:\\Hillel\\screenshot\\error.jpg\" target=\"_blank\"><img height=200 width=200 src=\"D:\\Hillel\\screenshot\\error.jpg\"></a>");

        System.out.println("Capture screenshot for the Failed test -- " + iTestResult.getName());
    }
}