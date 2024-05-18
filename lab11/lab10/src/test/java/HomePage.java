import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://markformelle.by/catalog/zhenshchinam/nizhnee-bele/");
    }
    public void open1() {
        driver.get("https://markformelle.by/magaziny/");
    }
    public void openWomanPage(){
        driver.get("https://markformelle.by/catalog/zhenshchinam/");
    }
    public void clickFirstButton() {
        WebElement firstButton = driver.findElement(By.xpath("//*[@id=\"js-submit-btn\"]"));
        firstButton.click();
    }


}
