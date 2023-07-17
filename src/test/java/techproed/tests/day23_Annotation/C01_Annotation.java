package techproed.tests.day23_Annotation;

import org.testng.annotations.*;

public class C01_Annotation {

    //Before Suite , test ve class en basta bir sefer ..After Suite, test ve class en son da bir sefer calisir
    // before ve after methodlar ise her testin basinda sonunda bir kez calisir

    @BeforeSuite
    public void suite() {
        System.out.println("@BeforeSuite --> Herseyden önce BeforeSuite calisir");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest ---> Bütün testlerden önce calisir");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("@BeforeClass  ---> Her class'dan önce bir kez calisir");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("@BeforeMethod  -->  JUnitteki @Before notasyonu gibi her methoddan once calisir");
    }

    @Test
    public void test01() {
        System.out.println("Test 1  calisti" );
    }

    @Test
    public void test02() {
        System.out.println("Test 2  calisti" );
    }

    @Test
    public void test03() {
        System.out.println("Test 3  calisti" );
    }



    @AfterSuite
    public void aftersuite() {
        System.out.println("AfterSuite  -->Herseyden sonra bir kez calisir");

    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest  --> Bütün testlerden sonra bir kez calisir");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass  ---> Her class'dan sonra bir kez calisir");
    }


    @AfterMethod
    public void tearDown(){
        System.out.println("AfterMethod  -->  JUnitteki @After notasyonu gibi her methoddan sonra calisir");
    }


}
