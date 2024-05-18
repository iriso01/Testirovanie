import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickSearchIcon() {
        WebElement link = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[4]/nav/div[2]"));
        link.click();
    }
    public void clickSalesButton() {
        By searchInputSelector = By.xpath("//*[@id=\"header-search-input\"]");
        By searchButtonSelector = By.xpath("/html/body/header/div[1]/div/div/div/div[2]/form/div[2]/div/button");

        WebElement searchInput = driver.findElement(searchInputSelector);


        searchInput.sendKeys("550U-1837");
        driver.get("https://markformelle.by/search/?q=550U-1837&s=%D0%9F%D0%BE%D0%B8%D1%81%D0%BA");
    }
    public void clickSales() {
        driver.get("https://markformelle.by/internet-magazin/promo/4-1-v-podarok-vygodnaya-aktsiya-na-muzhskoe-belye/");
    }
}
