package techproed.tests.day24_Priority_DepensOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_Ignore {

    /*
    Birden fazla test methodu calistirmak istedigimizde o anlik gereksiz gordugumuz test methodunu
    atlamak (ignore) isteyebiliriz.
    Bunun icin @Test notasyonu ustune ya da yanina @Ignroe notasyonu eklememiz yeterlidir
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }


   @Ignore   //  @Ignore  ile bu test'i es geciyoruz
   @Test
    public void amazonTest() {
        driver.get("https://amazon.com");
    }
    @Test (enabled = false)  // (enabled = false) methodu bu testi es gecer calistirmaz hatta yandaki Run  tusunuda kaldirdi . rapordada gözükmez
    public void youtubeTest() {
        driver.get("https://youtube.com");
    }
    @Test
    public void facebookTest() {
        driver.get("https://facebook.com");
    }


}