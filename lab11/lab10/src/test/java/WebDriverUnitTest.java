import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class WebDriverUnitTest {
    private WebDriver driver;
    private HomePage homePage;
    private ProductPage productPage;
    private CityPage cityPage;
    private DenimPage denimPage;
    private DressPage dressPage;
    private PinskPage pinskPage;
    private AddCartPage addCartPage;
    private ReviewPage reviewPage;
    private SalePage salePage;
    private SearchPage searchPage;
    private DownloadPage downloadPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        cityPage = new CityPage(driver);
        denimPage = new DenimPage(driver);
        dressPage = new DressPage(driver);
        pinskPage = new PinskPage(driver);
        addCartPage = new AddCartPage(driver);
        reviewPage = new ReviewPage(driver);
        salePage = new SalePage(driver);
        searchPage = new SearchPage(driver);
        downloadPage = new DownloadPage(driver);

    }

    @Test
    public void testButtonClick() throws InterruptedException {
        homePage.open();
        homePage.clickFirstButton();
        Thread.sleep(1000);

        productPage.clickLink();
        productPage.clickSecondLink();

        Thread.sleep(5000);

        // Проверка, что мы находимся на странице с избранными товарами после нажатия на кнопку
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("favorites")); // Предполагаем, что в URL есть "favorites"
    }
    @Test
    public void testButtonClickCity() throws InterruptedException {
        homePage.open1();
        homePage.clickFirstButton();
        Thread.sleep(2000);

        cityPage.clickLinkCity();
        cityPage.clickSecondLinkCity();

        Thread.sleep(5000);


    }
    @Test
    public void testBrandButton() throws InterruptedException {
        homePage.openWomanPage();
        homePage.clickFirstButton();


       denimPage.clickSelector();
       denimPage.ClickSecond();

        Thread.sleep(5000);


    }
    @Test
    public void testDressPage() throws InterruptedException {
        homePage.open();
        homePage.clickFirstButton();
Thread.sleep(1000);

       dressPage.clickMenu();
       dressPage.SeeAll();

        Thread.sleep(5000);


    }
    @Test
    public void testCityChoice() throws InterruptedException {
        homePage.open();
        homePage.clickFirstButton();
        Thread.sleep(1000);

        pinskPage.cliclCityChoice();
pinskPage.ClickPinskCity();

        Thread.sleep(5000);
    }
    @Test
    public void testProductToBuy() throws InterruptedException {
        homePage.openWomanPage();
        homePage.clickFirstButton();
        Thread.sleep(1000);

        addCartPage.clickToAdd();
        addCartPage.CheckCartClick();

        Thread.sleep(5000);
    }
    @Test
    public void testReview() throws InterruptedException {
        driver.get("https://markformelle.by/catalog/zhenshchinam/bryuki-leginsy/bryuki-leginsi/182447-334-1050/");
        homePage.clickFirstButton();
        Thread.sleep(1000);

        reviewPage.clickReviewButton();
        Thread.sleep(3000);


        Thread.sleep(5000);
    }
    @Test
    public void testSalesPage() throws InterruptedException {
        homePage.openWomanPage();
        homePage.clickFirstButton();
        Thread.sleep(1000);

       salePage.clickMainMenu();
       salePage.clickSalesButton();
       salePage.clickSales();
        Thread.sleep(5000);
    }
    @Test
    public void testSearchItem() throws InterruptedException {
        driver.get("https://markformelle.by/");
        homePage.clickFirstButton();
        Thread.sleep(3000);

        searchPage.ClickSearchIcon();
        searchPage.clickSalesButton();
        Thread.sleep(5000);
    }
    @Test
    public void testDonwloadPage() throws InterruptedException {
        driver.get("https://markformelle.by/");
        homePage.clickFirstButton();
        Thread.sleep(3000);

        downloadPage.clickDownloadPage();
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
