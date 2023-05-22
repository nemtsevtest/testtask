package Task.General;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactsUserPage {


    private By editButton = new By.ByXPath("//i[@class='ir812m3 fa fa-edit']");

    private By contacts = new By.ByXPath("//*[@href=\"/profile/contacts\"]");

    private WebDriver driver;

    public ContactsUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonEdit() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(editButton)).click();
    }

    public void selectContacts() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(contacts)).click();
    }
}
