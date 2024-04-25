import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
  public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\Drivers\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://markformelle.by/catalog/zhenshchinam/nizhnee-bele/");

    // Находим и нажимаем на первую кнопку
    WebElement firstButton = driver.findElement(By.xpath("//*[@id=\"js-submit-btn\"]"));
    firstButton.click();
    Thread.sleep(2000); // Пауза для ожидания загрузки

    // Находим и нажимаем на элемент <a>
    WebElement link = driver.findElement(By.xpath("//*[@id=\"bx_2156340845_595750_7448e467ee3baa7314864f433560a1a1\"]/div[1]/button[1]"));
    link.click();
    WebElement secondLink = driver.findElement(By.xpath("//*[@id=\"ico-favorites\"]"));
    secondLink.click();

    Thread.sleep(5000);

    driver.quit(); // Закрываем браузер
  }
}
