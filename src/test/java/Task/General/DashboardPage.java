package Task.General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    private By profile = new By.ByXPath("//*[@title=\"Profile\"]");
    private By contacts = new By.ByXPath("//*[@href=\"/profile/contacts\"]");
    private By cloudService = new By.ByXPath("//*[@title=\"Cloud Servers\"]");
    private By createManage = new By.ByXPath("//span[text()=\"Create & Manage\"]");

    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProfile() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(profile)).click();
    }

    public void selectcontacts() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(contacts)).click();
    }

    public void selectCloudService() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cloudService)).click();
    }

    public void selectCreateManage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(createManage)).click();
    }


}
