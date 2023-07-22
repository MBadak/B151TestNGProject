package techproed.tests.day28__DataProvider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtil;

public class C05_DataProviderUtilKullanimi {

    @Test (dataProvider = "sehirverileri", dataProviderClass = DataProviderUtil.class)
    public void test01(String sehir, String bolge, int plaka) {

        System.out.println(sehir +"  |   "+ bolge +"  |   "+ plaka);
    }
}
