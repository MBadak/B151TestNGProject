package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/*
POM(Page Object Model)
    Test senaryolarının daha az kod ile yazılmasına ve bakımının daha kolay yapılmasına
olanak sağlayan yazılım test yöntemidir. TestNG de ve CUCUMBER da POM kalıbını kullanırız
 */

public class Driver {
    private  Driver(){
        /*
        Driver class'ından obje oluşturmanın önüne geçmek için
        default constructor'ı private yaparak bunun önüne geçebiliriz
         */
    }
    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            /*
            Driver'i her cagirdigimizda yeni bir pencere acilmasinin onune gecmek icin if blogu icinde Eger driver'a
            deger atanmamissa deger ata , eger deger atanmissa Driver'i ayni sayfada return et
            */
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }


    public static void closeDriver() {
        if(driver != null){//-->driver'a deger ATANMISSA
            driver.close();
            driver = null;//-->driver'i kapattiktan sonra bosalt
        }
    }


    public static void quitDriver() {
        if (driver != null) {//-->driver'a deger ATANMISSA
            driver.quit();
            driver = null;//-->driver'i kapattiktan sonra bosalt
        }
    }
}

