package Task.General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CloudServersPage {

    private By createServerButton = new By.ByXPath("//span[text()=\"Create server\"]");

    private WebDriver driver;

    public CloudServersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreateServerButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOfElementLocated(createServerButton)).click();
    }

}
