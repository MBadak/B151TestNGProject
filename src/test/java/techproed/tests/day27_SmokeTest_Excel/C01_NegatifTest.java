package techproed.tests.day27_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_NegatifTest {
    //Description:
    //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
    //Acceptance Criteria
    //Customer email: fake@bluerentalcars.com
    //Customer password: fakepass
    //Error:
    //User with email fake@bluerentalcars.com not found

    @Test
    public void test01() {
        //BlueRental sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        //login buttonuna tiklayiniz
        BlueRentalPage blueRentalPage =  new BlueRentalPage();
        blueRentalPage.login.click();
        //Fake bir Email ve Password  gir
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("fakeemail"), Keys.TAB,
                                                 ConfigReader.getProperty("fakepassword"),Keys.ENTER);
        // Siteye giris yapilamadigini dogrula
        ReusableMethods.visibleWait(blueRentalPage.mesajVerify,5);
        Assert.assertTrue(blueRentalPage.mesajVerify.isDisplayed());
           //yada

        Assert.assertTrue(blueRentalPage.login.isDisplayed());



    }
}
