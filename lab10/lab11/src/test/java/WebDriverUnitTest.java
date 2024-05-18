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


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        cityPage = new CityPage(driver);


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

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
