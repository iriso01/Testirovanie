import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalePage {
    private WebDriver driver;

    public SalePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMainMenu() {
        WebElement link = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div[1]"));
        link.click();
    }
    public void clickSalesButton() {
        driver.get("https://markformelle.by/internet-magazin/promo/");
    }
    public void clickSales() {
driver.get("https://markformelle.by/internet-magazin/promo/4-1-v-podarok-vygodnaya-aktsiya-na-muzhskoe-belye/");
    }
}
