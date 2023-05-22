package Task.General;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private By loginField = new By.ByXPath("//*[@id=\"email\"]");
    private By passwordField = new By.ByXPath("//*[@id=\"password\"]");
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://portal.servers.com/login");
    }

    public void enterLogin(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginField)).sendKeys(text);

    }

    public void enterPassword(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(driver.findElement(passwordField)));
        driver.findElement(passwordField).sendKeys(text + Keys.ENTER);
    }

    public void login(String login, String password) {
        driver.get("https://portal.servers.com/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginField)).sendKeys(login);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(driver.findElement(passwordField)));
        driver.findElement(passwordField).sendKeys(password + Keys.ENTER);
    }


}
