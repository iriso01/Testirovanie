import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CityPage {
    private WebDriver driver;

    public CityPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkCity() {
        WebElement link = driver.findElement(By.xpath("//*[@id=\"store-city-styler\"]"));
        link.click();
    }

    public void clickSecondLinkCity() {
        WebElement secondLink = driver.findElement(By.xpath("//*[@id=\"store-city-styler\"]/div[2]/ul/li[3]"));
        secondLink.click();
    }
}
