import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DenimPage {
    private WebDriver driver;

    public DenimPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSelector() {
        WebElement link = driver.findElement(By.xpath("//*[@id=\"comp_78b5b97e70a195d13ec4f4d85746cd33\"]/form/div[4]/div[1]/ul/li[2]/div/div[1]/a"));
        link.click();
    }

    public void ClickSecond() {
        WebElement secondLink = driver.findElement(By.xpath("//*[@id=\"comp_78b5b97e70a195d13ec4f4d85746cd33\"]/form/div[4]/div[1]/ul/li[2]/div/div[3]/ul/li[7]/div"));
        secondLink.click();
    }
}
