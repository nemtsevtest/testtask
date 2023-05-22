package Task.General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactEditPage {

    private By phoneNumber = new By.ByXPath("//*[@name=\"phone_number\"]");
    private By saveButton = new By.ByXPath("//*[@title=\"Save\"]");

    private WebDriver driver;

    public ContactEditPage(WebDriver driver) {
        this.driver = driver;
    }

    public void editPhoneNumber(String phone) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumber)).clear();
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void clickButtonSave() {
        driver.findElement(saveButton).click();
    }


}
