package techproed.tests.day28__DataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C03_DataProviderTest {

    @DataProvider
    public static Object[][] blueRental() {
        return new Object[][]{

                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}

        };
    }

    @Test (dataProvider = "blueRental")
    public void test01(String mail,String password) {
        //BlueRentalCar sitesine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //DataProvi der'daki mail ve password bilgileri ile login olalim

        BlueRentalPage rentalPage =new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(1);
        rentalPage.email.sendKeys(mail, Keys.TAB, password,Keys.ENTER);

        //Sayfayi kapatalim
        Driver.closeDriver();

    }
}
