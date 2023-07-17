package techproed.tests.day24_Priority_DepensOnMethods;

import org.testng.annotations.Test;

public class C05_DependsOnMethods {       // Class methodunda Run edince tüm test ler sorunsuz calisti


    @Test                                    // bu test methodunda Run edince  sadece test1 calisti
    public void test01() {
        System.out.println("test01");
    }

    @Test (dependsOnMethods = "test01")     // bu test methodunda Run edince test1' de calistirarak calisti
    public void test02() {
        System.out.println("test02");
    }

    @Test (dependsOnMethods = "test02" )    // bu test methodunda Run edince No tests were found diyerek hata verdi calistirmadi
    public void test03() {
        System.out.println("test03");
    }


}
