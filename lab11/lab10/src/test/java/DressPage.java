import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressPage {
    private WebDriver driver;

    public DressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMenu() {
        WebElement link = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div[1]"));
        link.click();
    }

    public void DressClick() {
        WebElement secondLink = driver.findElement(By.xpath("/html/body/div[3]/div[6]/div[2]/nav/ul/li[1]/ul/li[7]"));
        secondLink.click();
    }
    public void SeeAll() {
        driver.get("https://markformelle.by/catalog/zhenshchinam/platya/");
    }
}
