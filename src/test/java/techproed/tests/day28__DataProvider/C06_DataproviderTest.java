package techproed.tests.day28__DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C06_DataproviderTest {

    @DataProvider
    public static Object[][] veriler() {
        return new Object[][]{
                {"esen"},
                {"mehmet"},
                {"esma"},
                {"ali"},
                {"mert"},
                {"burcu"},
                {"yunus"}
        };
    }

    @Test(dataProvider = "veriler")
    public void test01(String data) {
        System.out.println(data);

    }

    @Test(dataProvider = "veriler")
    public void test02(String isim) {
        System.out.println(isim);
    }

    @Test(dataProvider = "veriler")
    public void test03(String name) {
        System.out.println(name);
    }

    @Test(dataProvider = "veriler")
    public void test04(String ad) {
        System.out.println(ad);
    }
}
