import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class WebDriverUnitTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testButtonClick() throws InterruptedException {
        driver.get("https://markformelle.by/catalog/zhenshchinam/nizhnee-bele/");

        WebElement firstButton = driver.findElement(By.xpath("//*[@id=\"js-submit-btn\"]"));
        firstButton.click();
        Thread.sleep(2000);

        WebElement link = driver.findElement(By.xpath("//*[@id=\"bx_2156340845_595750_7448e467ee3baa7314864f433560a1a1\"]/div[1]/button[1]"));
        link.click();

        WebElement secondLink = driver.findElement(By.xpath("//*[@id=\"ico-favorites\"]"));
        secondLink.click();

        Thread.sleep(5000);

        // Проверка, что мы находимся на странице с избранными товарами после нажатия на кнопку
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("favorites")); // Предполагаем, что в URL есть "favorites"
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
