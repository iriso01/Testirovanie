import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCartPage {
    private WebDriver driver;

    public AddCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToAdd() {
        WebElement link = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div[1]"));
        link.click();
    }

    public void CheckCartClick() {
      driver.get("https://markformelle.by/internet-magazin/delivery/");
    }
    public void SelectSizeClick(){
        WebElement link = driver.findElement(By.xpath("//*[@id=\"bx_117848907_518317_skudiv\"]"));
        link.click();
    }
    public void SelectSizeClick1(){
        WebElement link = driver.findElement(By.xpath("//*[@id=\"mf-pr-table-atts\"]/div[2]/div/div[3]/div/div[4]/div[1]"));
        link.click();
    }

    public void DressPageOpen() {
        driver.get("https://markformelle.by/catalog/zhenshchinam/platya/platya-tuniki-korotkiy-rukav/sarafan-zhenskiy/");
    }
}
