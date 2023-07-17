package techproed.tests.day24_Priority_DepensOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_DependsOnMethods {
    /*
          Test methodları birbirinden bağımsız çalışır. Methodları birbirine bağımlı çalıştırmak istersek
      DEPENDSONMETHODS parametresini @Test notasyonundan sonra bağlamak istediğimiz test methodunun adını
      yazarak belirtiriz.
       */
    WebDriver driver;
    @Test
    public void test01() {
        //Bu methodda driver ayarlarını yapalım
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test (dependsOnMethods = "test01")
    public void test02() {
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

    }

    @Test (dependsOnMethods = "test02")
    public void test03() {
        //Amazonda arama kutusunda iphone aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

    }
}