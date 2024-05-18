import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PinskPage {
    private WebDriver driver;

    public PinskPage(WebDriver driver) {
        this.driver = driver;
    }

    public void cliclCityChoice() {
        WebElement link = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div[2]"));
        link.click();
    }

    public void ClickPinskCity() {
        driver.get("https://markformelle.by/catalog/zhenshchinam/platya/?CITY_ID=3198");
    }
}
