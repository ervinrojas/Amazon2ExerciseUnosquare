package Base;

import  Base.Setup;
import Locators.Identifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ParentsClass {

    protected static void ClickOnElement(Setup setup, By locators){
        Setup.WaitHelper(setup.driver, locators);
        setup.click(locators);
    }

    protected static void SendText(Setup setup, By locators, String TextToSearch) {
        WebElement element;
        Setup.WaitHelper(setup.driver, locators);
        element = setup.findElement(locators);
        setup.type(TextToSearch, locators);
        element.submit();
    }

    protected static void findPrice(Setup setup, By locators, String x) {
        Setup.WaitHelper(setup.driver, locators);
        String firstprice = setup.getText(locators);
        System.out.println(x +firstprice.replace("\n","."));
    }

    protected static void compareText(Setup setup,By locators, String result) {
        Setup.WaitHelper2(setup.driver, locators);
        Assert.assertEquals(setup.getText(locators), result);
    }
}


