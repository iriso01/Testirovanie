import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLink() {
        WebElement link = driver.findElement(By.xpath("//*[@id=\"bx_2156340845_599578_3f0919d9c30485165ad53492f68a79b6\"]/div[1]/button[1]"));
        link.click();
    }

    public void clickSecondLink() {
        WebElement secondLink = driver.findElement(By.xpath("//*[@id=\"ico-favorites\"]"));
        secondLink.click();
    }


}
