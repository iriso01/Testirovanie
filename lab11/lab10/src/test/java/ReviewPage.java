import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewPage {
    private WebDriver driver;

    public ReviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickReviewButton() {
        WebElement link = driver.findElement(By.xpath("//*[@id=\"js-reviews-preview\"]/a"));
        link.click();
    }

    public void clickSendReview() {
        WebElement secondLink = driver.findElement(By.xpath("//*[@id=\"popup-review\"]/div[1]/div/button"));
        secondLink.click();
    }
}
