import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadPage {
    private WebDriver driver;

    public DownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sadasdasd() {
        WebElement link = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div[1]"));
        link.click();
    }
    public void clickDownloadPage() {
        driver.get("https://play.google.com/store/apps/details?id=ru.markformelle.android&hl=ru");
    }
    public void clickSales() {
        driver.get("https://markformelle.by/internet-magazin/promo/4-1-v-podarok-vygodnaya-aktsiya-na-muzhskoe-belye/");
    }
}
