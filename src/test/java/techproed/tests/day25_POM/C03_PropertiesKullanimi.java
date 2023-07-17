package techproed.tests.day25_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.util.Properties;

public class C03_PropertiesKullanimi {


    @Test
    public void test01() {
        //Amazon sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //Basligin amazon icerdigini tesst edelim
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigReader.getProperty("expectedTitle");
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        // Arama kutusunda Iphone aratalim
        WebElement aramaKutusu = Driver.getDriver().findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys(ConfigReader.getProperty("searchBox"), Keys.ENTER);

        Driver.closeDriver();
    }

    @Test
    public void test02() {
        String amazonUrl=ConfigReader.getProperty("amazonUrl");
        System.out.println("amazonUrl = " + amazonUrl);
        String expectedTitle=ConfigReader.getProperty("expectedTitle");
        System.out.println("expectedTitle = " + expectedTitle);
        String searchBox=ConfigReader.getProperty("searchBox");
        System.out.println("searchBox = " + searchBox);


    }
}
