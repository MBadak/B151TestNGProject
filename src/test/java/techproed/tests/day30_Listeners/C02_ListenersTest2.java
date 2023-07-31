package techproed.tests.day30_Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_ListenersTest2 {
    @Test
    public void test01() {
        System.out.println("PASSED");
        Assert.assertTrue(true);
        Assert.assertEquals(5,5);

    }

    @Test
    public void test02() {
        System.out.println("FAILED");

        Assert.assertEquals(5,4);

    }

    @Test
    public void test03() {
        System.out.println("SKIP");
        throw  new SecurityException("bu method atlandi");
    }

    @Test
    public void test04() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().findElement(By.xpath("hdhhdjcn"));
    }
}
