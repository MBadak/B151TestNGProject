package techproed.tests.day26_PagesKullanimi;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C04_PozitifTest {

    @Test
    public void test01() {
        /*
        Acceptance Criteria:
        Admin olarak, uygulamaya giriş yapabilmeliyim
        https://www.bluerentalcars.com/
        Admin email: jack@gmail.com
        Admin password: 12345
         */

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BlueRentalPage blueRentalPage= new BlueRentalPage();
        blueRentalPage.login.click();
        ReusableMethods.bekle(2);

        blueRentalPage.email.sendKeys(ConfigReader.getProperty("bluerentalEmail"), Keys.TAB,
                                     ConfigReader.getProperty("bluerentalPassword"),Keys.ENTER);

        Assert.assertTrue(blueRentalPage.loginVerify.getText().contains("Jack"));
        Driver.getDriver().close();


    }
}
