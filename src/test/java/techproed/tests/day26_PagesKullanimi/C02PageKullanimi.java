package techproed.tests.day26_PagesKullanimi;

import io.netty.handler.ssl.PemX509Certificate;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage2;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C02PageKullanimi {

    @Test
    public void test01() {


            //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
            Driver.getDriver().get(ConfigReader.getProperty("opensourceUrl"));

            //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
            //kullanici=Admin -->.properties dosyasında
            //kullaniciSifre=admin123 -->.properties dosyasında
            OpenSourcePage2.username().sendKeys(ConfigReader.getProperty("kullaniciAdi"));
            OpenSourcePage2.password().sendKeys(ConfigReader.getProperty("sifre"));
            ReusableMethods.bekle(3);
            OpenSourcePage2.login().click();

            //Login Testinin basarili oldugunu test et
            PemX509Certificate OpenSourcePageClass;
            Assert.assertTrue(OpenSourcePage2.verify().isDisplayed());
        }
    }
