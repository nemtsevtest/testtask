package Task.General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactsPage {

    private By createButton = new By.ByXPath("//*[@title=\"Create\"]");
    private By deleteButton = new By.ByXPath("//i[@class='ir812m3 fa fa-trash'][1]");
    private By popupDeleteButton = new By.ByXPath("//button[@class='b1bglpbc i1xgqw2w bsrnrzh d10o81fy m1wy5r5j']");
    private By login = new By.ByXPath("//div[@class='c1asuurm']");
    private By logout = new By.ByXPath("//span[text()='Logout']");

    private WebDriver driver;

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreateButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(createButton)).click();
    }

    public void clickDeleteButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton)).click();
    }

    public void clickPopupDeleteButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(popupDeleteButton)).click();
    }

    public void selectLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(login)).click();
    }

    public void selectLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(logout)).click();
    }

    public void logout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.elementToBeClickable(logout)).click();
    }


}
