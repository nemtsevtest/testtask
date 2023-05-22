package Task.General;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateCloudServerPage {

    private By amsterdamAz3 = new By.ByXPath("//input[@value=\"7\"]");
    private By almalinux8 = new By.ByXPath("//input[@value=\"06ad23cb-850b-43c3-aff5-dbd59bd2ed40\"]");
    private By ssd30 = new By.ByXPath("//input[@value=\"30\"]");
    private By generateKey = new By.ByXPath("//span[text()=\"Generate new SSH key\"]");
    private By inputName = new By.ByXPath("//input[@name=\"name\"]");
    private By buttonCreateServer = new By.ByXPath("//button[@title=\"Create Cloud Server\"]");


    private WebDriver driver;

    public CreateCloudServerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAmsterdamAz3() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(amsterdamAz3)).click();
    }

    public void clickAlmalinux8() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(almalinux8)).click();
    }

    public void clickSSD30() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ssd30)).click();
    }

    public void clickGenerateKey() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(generateKey)).click();
    }

    public void inputName(String name) {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputName)).sendKeys(name);
    }

    public void clickbuttonCreateServer() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonCreateServer)).click();
    }
}
